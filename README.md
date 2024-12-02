
# **MLOps Pipeline Code Generator**


## **Description**

Ce projet utilise l'**Ingénierie Dirigée par les Modèles (Model-Driven Engineering, MDE)** pour automatiser la génération d'artefacts nécessaires à un pipeline MLOps, tels que :
- Scripts d'entraînement (`train.py`),
- Fichiers Docker (`Dockerfile`),
- Configurations de déploiement (`deployment.yaml`).

Grâce à **Eclipse Ecore** et **Acceleo**, le projet transforme un modèle descriptif (conforme au métamodèle `MLops.ecore`) en fichiers prêts à l'emploi pour simplifier les étapes du cycle DevOps/MLOps.

---

## **Fonctionnalités**

- **Modélisation de pipeline MLOps** : Définissez un pipeline en utilisant un fichier `.xmi` basé sur le métamodèle Ecore.
- **Génération automatisée d'artefacts** : 
  - Dockerfiles pour la conteneurisation.
  - Scripts Python pour l'entraînement des modèles.
  - Fichiers YAML pour le déploiement Kubernetes.
- **Flexibilité et extensibilité** : Adaptez ou étendez facilement les templates pour répondre à vos besoins.

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
