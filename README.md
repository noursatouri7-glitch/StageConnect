# StageConnect

## S1.1 — Fiche Projet

**StageConnect** est une plateforme de mise en relation entre les étudiants à la recherche de stages et les entreprises proposant des opportunités.

L'application permet aux étudiants de consulter et postuler aux offres, tandis que les entreprises peuvent publier et gérer leurs annonces.

---

## Objectif du projet

Créer une application simple et efficace permettant d'améliorer la recherche de stage pour les étudiants et la gestion des candidatures pour les entreprises.

---

## Problème résolu

Les étudiants rencontrent souvent des difficultés pour trouver des stages adaptés à leur profil, tandis que les entreprises ont du mal à diffuser efficacement leurs offres et à gérer les candidatures.

---

## Cible

- Étudiants universitaires
- Entreprises proposant des stages
- Administrateurs de la plateforme

---

## Acteurs du système

- Étudiant
- Entreprise
- Administrateur

---

## Fonctionnalités principales

| Membre | Fonctionnalité |
|---|---|
| Loujayen Habbechi | Inscription et authentification |
| Nour Satouri | Publication et gestion des offres de stage |
| Yesmine Toumi | Recherche et filtrage des stages |
| Montaha Ferchichi | Candidature et suivi des demandes |
| Shaima Achouri | Tableau de bord administrateur |

---

## Organisation du projet

```text
StageConnect/
├── README.md
├── docs/
│   ├── rapport.pdf
│   └── captures/
│       ├── maquettes/
│       ├── kanban/
│       └── reviews/
├── diagrammes/
│   ├── DCU_StageConnect.puml
│   ├── DC_StageConnect.puml
│   └── DS_StageConnect_ScenarioComplet.puml
├── src/
│   └── com/
│       └── stageconnect/
│           └── models/
│               ├── Main.java
│               ├── Utilisateur.java
│               ├── Etudiant.java
│               ├── Entreprise.java
│               ├── OffreStage.java
│               ├── GestionOffres.java
│               ├── Candidature.java
│               └── Admin.java
└── tests/
```

---

## Diagrammes UML

Le projet contient les diagrammes suivants :

- Diagramme de cas d'utilisation
- Diagramme de classes
- Diagramme de séquence principal
- Diagramme de séquence supplémentaire Sprint 2

Les fichiers PlantUML sont placés dans le dossier :

```text
diagrammes/
```

---

## Scénario complet Sprint 2

Le scénario complet exécuté dans `Main.java V2` est le suivant :

1. Un étudiant s'inscrit sur la plateforme.
2. L'étudiant se connecte.
3. Une entreprise publie des offres de stage.
4. L'étudiant recherche une offre selon le lieu.
5. L'étudiant postule à une offre.
6. L'entreprise consulte et accepte la candidature.
7. L'administrateur consulte le tableau de bord.

Ce scénario démontre l'interaction entre toutes les fonctionnalités principales du projet.

---

## Compilation et exécution

Depuis la racine du projet, exécuter :

```bash
javac -encoding UTF-8 -d out src/com/stageconnect/models/*.java
```

Puis :

```bash
java -cp out com.stageconnect.models.Main
```

---

## Workflow GitHub

Chaque membre travaille sur une branche dédiée à sa fonctionnalité.

Exemples de branches :

```text
feature/authentification
feature/gestion-offres
feature/recherche-stages
feature/candidature-suivi
feature/admin-dashboard
```

Commandes utiles :

```bash
git checkout -b feature/nom-fonctionnalite
git add .
git commit -m "Ajout de la fonctionnalité"
git push -u origin feature/nom-fonctionnalite
```

Ensuite, chaque membre crée une Pull Request vers la branche `main`.

---

## Technologies et outils utilisés

- Java
- Git
- GitHub
- PlantUML
- Figma ou outil équivalent pour les maquettes
- IntelliJ IDEA ou VS Code

---

## Équipe

| Initiales | Nom | Fonctionnalité |
|---|---|---|
| LH | Loujayen Habbechi | Inscription et authentification |
| NS | Nour Satouri | Publication et gestion des offres de stage |
| YT | Yesmine Toumi | Recherche et filtrage des stages |
| MF | Montaha Ferchichi | Candidature et suivi des demandes |
| SA | Shaima Achouri | Tableau de bord administrateur |

---

## Statut du projet

Projet réalisé dans le cadre du module **Atelier de Génie Logiciel**.

**Sprint 1 :** Fiche projet, backlog, maquettes, UML et prototype Java V1.  
**Sprint 2 :** Logique métier complète, scénario `Main.java V2`, rapport final et soutenance.

---

## Auteur

Équipe StageConnect — Projet AGL 2025/2026
