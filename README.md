# **MLOps Pipeline Code Generator**

## **Description**

Le **MLOps Pipeline Code Generator** est un outil innovant qui exploite l'**Ingénierie Dirigée par les Modèles (MDE)** pour automatiser la génération des artefacts nécessaires à la mise en place d'un pipeline MLOps. Conçu pour maximiser l'efficacité et la reproductibilité, ce projet repose sur plusieurs métamodèles spécifiques pour couvrir toutes les étapes clés d'un pipeline MLOps :

1. **Prétraitement des données**  
2. **Définition du modèle**  
3. **Entraînement**  
4. **Évaluation**  
5. **Conteneurisation (Docker)**  
6. **Déploiement (Kubernetes)**  

### **Points Clés**
- **Génération Automatique** : Gènère des scripts Python (`train.py`, `evaluate.py`), des fichiers Docker (`Dockerfile`), et des configurations Kubernetes (`deployment.yaml`) à partir de modèles définis.  
- **Interfaces Intuitives** : Remplace la création manuelle d’instances `.xmi` par des interfaces graphiques interactives basées sur **EMF Forms** et intégrées dans une application **SWT**.  
- **Extensibilité** : Permet d'étendre facilement les métamodèles et les artefacts générés pour répondre aux besoins spécifiques des utilisateurs.  

Grâce à une combinaison d’**Eclipse Ecore**, **Acceleo**, **EMF Forms**, et une application **SWT**, ce projet est une solution puissante et modulaire pour gérer des pipelines MLOps de bout en bout.

---

## ** Workflow**
![Diagramme UML du Métamodèle Docker](./Diagrams/Docker_Diagram.png)  

## **1. Prétraitement des Données**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle PreProcess](./Diagrams/PreProcess_Diagram.png)  

### **Interface Utilisateur**
L'interface permet de configurer facilement les étapes de nettoyage et de transformation des données :  
![Interface PreProcess](./Interfaces/PreProcess_Interface.png)  

### **Exemple d'Instance (`PreProcess.xmi`)**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<preprocess_model:DataProcessing
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:preprocess_model="http://www.example.org/preprocess_model"
    xsi:schemaLocation="http://www.example.org/preprocess_model preprocess_model.ecore"
    name="Prepocess">
  <functions
      name="load_ais_data"
      description="Charge les données AIS à partir d'un fichier CSV">
    <parameters
        name="file_path"
        type="String"/>
    <returnType
        type="DataFrame"
        description="Les données AIS chargées avec des timestamps convertis"/>
  </functions>
  <functions
      name="clean_data"
      description="Nettoie les données en supprimant les valeurs aberrantes et manquantes">
    <parameters
        name="df"
        type="DataFrame"/>
    <returnType
        type="DataFrame"
        description="Les données nettoyées avec des lignes invalides supprimées"/>
  </functions>
  <functions
      name="create_sequences"
      description="Crée des séquences pour l'apprentissage">
    <parameters
        name="df"
        type="DataFrame"/>
    <parameters
        name="seq_length"
        type="Int"
        defaultValue="10"/>
    <parameters
        name="prediction_horizon"
        type="Int"
        defaultValue="3"/>
    <returnType
        type="Tuple"
        description="Les séquences et cibles générées pour l'apprentissage"/>
  </functions>
  <functions
      name="scale_data"
      description="Normalise les données">
    <parameters
        name="X_train"
        type="Array"/>
    <parameters
        name="X_test"
        type="Array"/>
    <returnType
        type="Tuple"
        description="Les données normalisées et le scaler utilisé"/>
  </functions>
  <functions
      name="prepare_data"
      description="Fonction principale de préparation des données">
    <parameters
        name="file_path"
        type="String"/>
    <parameters
        name="seq_length"
        type="Int"
        defaultValue="10"/>
    <parameters
        name="prediction_horizon"
        type="Int"
        defaultValue="3"/>
    <parameters
        name="test_split"
        type="Float"
        defaultValue="0.2"/>
    <returnType
        type="Tuple"
        description="Les données d'entraînement, de test et le scaler"/>
  </functions>
</preprocess_model:DataProcessing>

```

### **Artefact Généré (`preprocess.py`)**
```python

import pandas as pd
import numpy as np
from sklearn.preprocessing import StandardScaler
from datetime import datetime

def load_ais_data(file_path):
    
    # Charge les données AIS à partir d'un fichier CSV
    
    df = pd.read_csv(file_path)
    df[ 'timestamp'] = pd.to_datetime(df[ 'timestamp'])
    return df


def clean_data(df):
    
    # Nettoie les données en supprimant les valeurs aberrantes et manquantes
    
    # Supprimer les lignes avec des valeurs manquantes
    df = df.dropna(subset=[ 'latitude', 'longitude', 'speed', 'course'])
    # Supprimer les vitesses aberrantes (par exemple > 30 nœuds)
    df = df[ df[ 'speed'] <= 30]
    # Supprimer les positions aberrantes
    df = df[ df[ 'latitude'] .between(-90, 90)] 
    df = df[ df[ 'longitude'].between(-180, 180)] 
    return df


def create_sequences(df, seq_length=10, prediction_horizon=3):
    
    # Crée des séquences pour l'apprentissage
    
    sequences = [] 
    targets = [] 
    # Trier par MMSI et timestamp
    df = df.sort_values([ 'mmsi', 'timestamp'])
    for mmsi in df[ 'mmsi'].unique():
        vessel_data = df[ df[ 'mmsi'] == mmsi]
        if len(vessel_data) < seq_length + prediction_horizon:
            continue
        for i in range(len(vessel_data) - seq_length - prediction_horizon + 1):
            sequence = vessel_data.iloc[ i:i+seq_length]
            target = vessel_data.iloc[ i+seq_length:i+seq_length+prediction_horizon][ [ 'latitude', 'longitude']]
            sequences.append(sequence[ [ 'latitude', 'longitude', 'speed', 'course']].values)
            targets.append(target.values)
    return np.array(sequences), np.array(targets)


def scale_data(X_train, X_test):
    
    # Normalise les données
    
    scaler = StandardScaler()
    original_shape = X_train.shape
    X_train_reshaped = X_train.reshape(-1, X_train.shape[-1])
    X_test_reshaped = X_test.reshape(-1, X_test.shape[ -1])
    X_train_scaled = scaler.fit_transform(X_train_reshaped)
    X_test_scaled = scaler.transform(X_test_reshaped)
    X_train_scaled = X_train_scaled.reshape(original_shape)
    X_test_scaled = X_test_scaled.reshape(X_test.shape)
    return X_train_scaled, X_test_scaled, scaler


def prepare_data(file_path, seq_length=10, prediction_horizon=3, test_split=0.2):
    
    # Fonction principale de préparation des données
    
    # Charger et nettoyer les données
    df = load_ais_data(file_path)
    df = clean_data(df)
    # Créer les séquences
    X, y = create_sequences(df, seq_length, prediction_horizon)
    train_size = int(len(X) * (1 - test_split))
    X_train, X_test = X[:train_size], X[train_size:]
    y_train, y_test = y[ :train_size], y[train_size:]
    X_train_scaled, X_test_scaled, scaler = scale_data(X_train, X_test)
    return X_train_scaled, X_test_scaled, y_train, y_test, scaler
```

---

## **2. Définition du Modèle**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Model](./Diagrams/Model_Diagram.png)  

### **Interface Utilisateur**
L'interface permet de choisir un type de modèle, un algorithme et de configurer les hyperparamètres :  
![Interface Model](./Interfaces/Model_Interface.png)  

### **Exemple d'Instance (`Model.xmi`)**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<model:Model
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:model="http://www.example.org/model"
    xsi:schemaLocation="http://www.example.org/model model.ecore"
    name="Model"
    seqLength="10"
    nFeatures="4"
    nOutputs="2">
  <layers units="128"
      inputShape="seq_length,n_features"
      dropoutRate="0.2"
      returnSequences="true"/>
  <layers type="BatchNormalization"/>
  <layers type="Dropout"
      dropoutRate="0.2"/>
  <layers units="64"
      dropoutRate="0.2"/>
  <layers type="BatchNormalization"/>
  <layers type="Dropout"
      dropoutRate="0.2"/>
  <layers type="Dense"
      units="32"
      activation="relu"/>
  <layers type="BatchNormalization"/>
  <layers type="Dense"
      units="2"
      activation="linear"/>
  <optimizer
      learningRate="0.001"/>
  <compilationConfig
      loss="mse">
    <metrics>mae</metrics>
  </compilationConfig>
</model:Model>

```

### **Artefact Généré (`model_definition.py`)**
```python

import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import LSTM, Dense, Dropout, BatchNormalization

def create_model(seq_length, n_features, n_outputs):
    
   #Crée un modèle LSTM pour la prédiction de trajectoire
    
   model = Sequential([ 
    
          # Première couche LSTM
        LSTM(128, return_sequences=true, input_shape=(seq_length,n_features)),
        BatchNormalization(),
        Dropout(0.2),
    
          # Deuxième couche LSTM
        LSTM(64, return_sequences=false, input_shape=()),
        BatchNormalization(),
        Dropout(0.2),
        
          # Deuxième couche LSTM
        Dense(32, activation='relu'),
        BatchNormalization(),
         # Sortie: positions prédites
    ] )

# Compiler le modèle

   model.compile(
        optimizer=tf.keras.optimizers.Adam(learning_rate=0.001),
        loss='mse',
        metrics=[  ['mae'] ]
   )
    
   return model

def create_simple_model(seq_length, n_features, n_outputs):
    
    #Version plus simple du modèle pour les tests initiaux
    
   model = Sequential([ 
        LSTM(64, input_shape=(seq_length, n_features)),
        Dense(32, activation='relu'),
        Dense(n_outputs, activation='linear')
   ])
    
   model.compile(
        optimizer='adam',
        loss='mse',
        metrics=[ 'mae']
   )

   return model
```

---

## **3. Entraînement**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Training](./Diagrams/Training_Diagram.png)  

### **Interface Utilisateur**
Configurez les données d'entraînement, les métriques et les callbacks :  
![Interface Training](./Interfaces/Training_Interface.png)  

### **Exemple d'Instance (`Training.xmi`)**
Il est dans le dossier Training/model/

### **Artefact Généré (`Train.py`)**

Il est dans le dossier MlopsGenerated/

---

## **4. Évaluation**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Evaluate](./Diagrams/Evaluate_Diagram.png)  

### **Interface Utilisateur**
Configurez les métriques d’évaluation :  
![Interface Evaluate](./Interfaces/Evaluate_Interface.png)  

### **Exemple d'Instance (`EvaluationProcess.xmi`)**
Il est dans le dossier Evaluate/model/

### **Artefact Généré (`evaluate.py`)**
Il est dans le dossier MlopsGenerated/

---

## **5. Dockerisation**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Docker](./Diagrams/Docker_Diagram.png)  

### **Interface Utilisateur**
Configurez les bases et dépendances pour Docker :  
![Interface Docker](./Interfaces/Docker_Interface.png)  

### **Exemple d'Instance (`Docker.xmi`)**
Il est dans le dossier Docker/model/
### **Artefact Généré (`Dockerfile`)**

Il est dans le dossier MlopsGenerated/

---

## **5. Kubernetes**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Docker](./Diagrams/Docker_Diagram.png)  

### **Interface Utilisateur**
Configurez les bases et dépendances pour Docker :  
![Interface Docker](./Interfaces/Docker_Interface.png)  

### **Exemple d'Instance (`Kubernetes.xmi`)**
Il est dans le dossier Kubernetes/model/
### **Artefact Généré (`deploy.yaml`)**

Il est dans le dossier MlopsGenerated/

