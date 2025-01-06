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

## **1. Prétraitement des Données**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle PreProcess](./Diagrams/PreProcess_Diagram.png)  

### **Interface Utilisateur**
L'interface permet de configurer facilement les étapes de nettoyage et de transformation des données :  
![Interface PreProcess](./Interfaces/PreProcess_Interface.png)  

### **Exemple d'Instance (`PreProcess.xmi`)**
```xml
<preProcess name="DataPreprocessingPipeline" version="1.0">
  <inputPath>/data/raw</inputPath>
  <outputPath>/data/processed</outputPath>
  <steps>
    <step operation="normalize" target="features"/>
    <step operation="removeNulls" target="rows"/>
  </steps>
</preProcess>
```

### **Artefact Généré (`data_processing.py`)**
```python
import pandas as pd

# Example preprocessing script
print("Starting preprocessing...")
data = pd.read_csv('/data/raw/data.csv')

# Apply steps
data = data.dropna()  # Remove nulls
data = (data - data.min()) / (data.max() - data.min())  # Normalize

data.to_csv('/data/processed/data.csv', index=False)
print("Preprocessing complete. Processed data saved to /data/processed.")
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
<model name="RandomForestModel" type="classification">
  <algorithm>RandomForest</algorithm>
  <parameters>
    <parameter key="n_estimators" value="100"/>
    <parameter key="max_depth" value="10"/>
  </parameters>
</model>
```

### **Artefact Généré (`model_definition.py`)**
```python
from sklearn.ensemble import RandomForestClassifier

# Define model
model = RandomForestClassifier(n_estimators=100, max_depth=10)
print("RandomForest model defined with hyperparameters: n_estimators=100, max_depth=10")
```

---

## **3. Entraînement**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Training](./Diagrams/Training_Diagram.png)  

### **Interface Utilisateur**
Configurez les données d'entraînement, les métriques et les callbacks :  
![Interface Training](./Interfaces/Training_Interface.png)  

### **Exemple d'Instance (`Training.xmi`)**
```xml
<training name="TrainingPipeline" datasetPath="/data/processed/data.csv">
  <modelRef>RandomForestModel</modelRef>
  <metrics>accuracy</metrics>
</training>
```

### **Artefact Généré (`training.py`)**
```python
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score

# Load data
print("Loading data...")
data = pd.read_csv('/data/processed/data.csv')

# Example training logic
X, y = data.iloc[:, :-1], data.iloc[:, -1]
model = RandomForestClassifier(n_estimators=100, max_depth=10)
model.fit(X, y)

print("Training complete. Model accuracy: ", accuracy_score(y, model.predict(X)))
```

---

## **4. Évaluation**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Evaluate](./Diagrams/Evaluate_Diagram.png)  

### **Interface Utilisateur**
Configurez les métriques d’évaluation :  
![Interface Evaluate](./Interfaces/Evaluate_Interface.png)  

### **Exemple d'Instance (`Evaluate.xmi`)**
```xml
<evaluation name="EvaluationPipeline">
  <metrics>f1_score, recall</metrics>
</evaluation>
```

### **Artefact Généré (`evaluation.py`)**
```python
from sklearn.metrics import f1_score, recall_score

# Evaluate model
print("Evaluating model...")
# Add evaluation logic here
```

---

## **5. Dockerisation**

### **Diagramme UML du Métamodèle**
![Diagramme UML du Métamodèle Docker](./Diagrams/Docker_Diagram.png)  

### **Interface Utilisateur**
Configurez les bases et dépendances pour Docker :  
![Interface Docker](./Interfaces/Docker_Interface.png)  

### **Exemple d'Instance (`Docker.xmi`)**
```xml
<docker name="DockerPipeline">
  <baseImage>python:3.8-slim</baseImage>
  <dependencies>scikit-learn</dependencies>
</docker>
```

### **Artefact Généré (`Dockerfile`)**
```dockerfile
FROM python:3.8-slim

RUN pip install scikit-learn

COPY /data /app/data
COPY training.py /app/

WORKDIR /app

CMD ["python", "training.py"]
```

---

