
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

## **Fonctionnalités**

1. **Interfaces graphiques interactives** :  
   - Interfaces basées sur **EMF Forms** pour chaque étape (prétraitement, entraînement, etc.), accessibles via une application **SWT**.  
   - Simplifie la création et la gestion des pipelines sans nécessiter de connaissances approfondies en modélisation Ecore.  

2. **Méta-modélisation avancée** :  
   - **Prétraitement** : Définit les étapes de nettoyage, normalisation et transformation des données.  
   - **Modèle** : Permet de configurer les types de modèles, algorithmes et hyperparamètres.  
   - **Entraînement** : Capture les détails des données d’entraînement, métriques et stratégies d’apprentissage.  
   - **Évaluation** : Spécifie les métriques et techniques de validation croisée.  
   - **Dockerisation** : Gènère des Dockerfiles basés sur les besoins du pipeline.  
   - **Déploiement** : Crée des fichiers YAML pour orchestrer les services sur Kubernetes.  

3. **Génération d’artefacts automatisée** :  
   - Production d'artefacts à partir des modèles définis via **Acceleo**.  
   - Réduction des erreurs manuelles grâce à la génération basée sur des métamodèles bien définis.  

4. **Exécution et déploiement faciles** :  
   - Scripts et configurations prêtes à l'emploi pour l’entraînement, la dockerisation et le déploiement sur Kubernetes.  

---

## **Technologies Utilisées**

- **Eclipse Modeling Framework (EMF)** : Pour la définition des métamodèles et des instances modèles.  
- **Acceleo** : Génération d'artefacts à partir de modèles.  
- **EMF Forms + SWT** : Interfaces graphiques conviviales pour interagir avec les modèles.  
- **Python** : Scripts pour les étapes de traitement, entraînement et évaluation.  
- **Docker et Kubernetes** : Pour la conteneurisation et l'orchestration.  

---

## **Structure du Projet**

```
.
├── MLopsModel/               # Projet contenant le métamodèle Ecore et les instances.
│   ├── MLops.ecore           # Métamodèle Ecore décrivant le pipeline MLOps.
│   ├── pipeline_example.xmi  # Exemple d'instance de pipeline.
│
├── MLopsCodeGen/             # Projet contenant les templates Acceleo.
│   ├── PipelineCodeGen.mtl   # Templates de génération des artefacts.
│
├── MLopsGenerated/           # Projet contenant les artefacts générés.
│   ├── ExamplePipeline_train.py
│   ├── ExamplePipeline_Dockerfile
│   ├── ExamplePipeline_deployment.yaml
│
├── README.md                 # Documentation du projet.
└── LICENSE                   # Licence du projet.
```

---

## **Pré-requis**

- **Eclipse IDE for Java and DSL Developers**
  - [Télécharger ici](https://www.eclipse.org/downloads/).
- **Acceleo** : Génération de texte à partir de modèles.
  - Installer via **Eclipse Marketplace**.
- **Java JDK 17+**
- **Python 3.8+** (pour exécuter les scripts générés).
- **Docker** (pour construire et tester les images).
- **kubectl** (pour déployer les fichiers YAML générés sur Kubernetes).

---

## **Installation**

1. **Cloner le dépôt :**
   ```bash
   git clone https://github.com/Emavero/mlops-code-generator.git
   cd mlops-code-generator
   ```

2. **Configurer Eclipse :**
   - Importez les projets `MLopsModel`, `MLopsCodeGen` et `MLopsGenerated` dans votre workspace Eclipse.
   - Vérifiez que les dépendances du métamodèle sont bien configurées dans Acceleo.

---

## **Utilisation**

### **Étape 1 : Modélisation**
1. Ouvrez le fichier `MLops.ecore` pour comprendre la structure du pipeline.
2. Créez une instance `.xmi` (ou utilisez `pipeline_example.xmi`) pour définir les détails de votre pipeline :
   - Exemple :
     ```xml
     <pipeline name="ExamplePipeline" version="1.0">
       <dataProcessing inputPath="/data/input" outputPath="/data/output"/>
       <training algorithm="RandomForest">
         <parameters key="n_estimators" value="100"/>
       </training>
       <deployment targetPlatform="Docker" scalability="3"/>
     </pipeline>
     ```

### **Étape 2 : Génération d'artefacts**
1. **Lancer la génération avec Acceleo** :
   - Clic droit sur `PipelineCodeGen.mtl` > **Run As > Launch Acceleo Application**.
2. **Sélectionner le modèle** :
   - Choisissez `pipeline_example.xmi` comme fichier d'entrée.
3. **Résultats** :
   - Les artefacts générés (scripts, Dockerfiles, fichiers YAML) sont placés dans `MLopsGenerated/`.

### **Étape 3 : Tester les artefacts**
1. **Tester le script d'entraînement :**
   ```bash
   python MLopsGenerated/ExamplePipeline_train.py
   ```
2. **Construire l'image Docker :**
   ```bash
   docker build -t example_pipeline -f MLopsGenerated/ExamplePipeline_Dockerfile .
   ```
3. **Déployer sur Kubernetes :**
   ```bash
   kubectl apply -f MLopsGenerated/ExamplePipeline_deployment.yaml
   ```

---

## **Exemple de Résultat**

### Dockerfile :
```dockerfile
FROM python:3.9-slim

RUN pip install sklearn

COPY /data/input /app/data
COPY train.py /app/

WORKDIR /app

CMD ["python", "train.py"]
```

### Script d'entraînement :
```python
from sklearn.ensemble import RandomForestClassifier

# Parameters
params = {
    'n_estimators': 100,
}

# Example of training script
print(f"Training data from /data/input with params {params}")
# Add actual training logic here

print(f"Model saved to /data/output")
```

---

## **Personnalisation**

- **Ajouter de nouveaux artefacts :**
  - Modifiez ou ajoutez des templates dans `PipelineCodeGen.mtl`.
- **Étendre le métamodèle :**
  - Ajoutez de nouvelles EClasses ou attributs dans `MLops.ecore`.

---

## **Contributions**

Les contributions sont les bienvenues ! Suivez ces étapes :
1. Forkez le dépôt.
2. Créez une branche pour vos modifications.
3. Soumettez une Pull Request avec une description claire.


---

## **À Propos**

Ce projet a été développé pour démontrer l’utilisation de l’ingénierie dirigée par les modèles (MDE) dans le domaine du MLOps, en automatisant la génération d’artefacts essentiels pour des pipelines reproductibles et déployables.
