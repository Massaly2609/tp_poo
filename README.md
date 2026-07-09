# 🎓 Travaux Dirigés & Pratiques - Programmation Orientée Objet (Java)

Ce dépôt regroupe l'ensemble des travaux dirigés (TD) et travaux pratiques (TP) réalisés dans le cadre du module de **Programmation Orientée Objet (POO)** en **Master 1 Informatique** à l'**Université Assane Seck de Ziguinchor (UASZ)**.

L'objectif de ce projet est de consolider les concepts fondamentaux de la POO en Java, allant de l'encapsulation de base à la modélisation UML complexe (associations, agrégations, compositions, héritage et interfaces).

---

## 🛠️ Concepts POO Maîtrisés & Implémentés

* **Encapsulation stricte :** Utilisation systématique d'attributs `private` avec accesseurs (`get`) et mutateurs (`set`).
* **Gestion des Multiplicités :**
    * Relations uniques (`1..1` ou `0..1`) par référence d'objet directe.
    * Relations multiples (`0..*` ou `1..*`) via des collections dynamiques (`ArrayList<E>`).
* **Cycle de vie des structures :**
    * **Composition ($\blacklozenge$) :** Cycle de vie dépendant (ex: Une `Salle` instanciée directement via une méthode du `Cinema`).
    * **Agrégation ($\diamondsuit$) :** Cycle de vie indépendant (ex: Association entre `Patient` et `Medecin` ou `Feutre` et `Bouchon`).
* **Classes d'association :** Matérialisation de relations complexes porteuses d'attributs (ex: la classe `Projection` unissant `Salle` et `Film`).
* **Polymorphisme & Spécialisation :**
    * Héritage (`extends`) avec appel au constructeur parent (`super()`) et redéfinition de méthodes (`@Override`).
    * Abstraction et Interfaces (`abstract class` et `interface`) pour la gestion des comportements multi-milieux.

---

## 📂 Architecture de la Solution (Packages)

Le projet est structuré de manière modulaire au sein d'un unique projet Java, découpé par exercice et thématique :

```text
sn.uasz.tp
│
├── td_n2
│   ├── exercice1 (Gestion de Comptes Bancaires & Banque avec Scanner)
│   └── exercice2 (Représentation géométrique : Point et Segment)
│
├── td_n3
│   └── exercice1 (Relation Bidirectionnelle : Patient 0..* ↔ 0..* Medecin)
│
├── td_n4
│   ├── exercice1 (Hiérarchie d'entreprise : Personne → Employe → Chef → Directeur)
│   └── exercice2 (Magasin de Matériels Informatiques : Produit, Ordinateur, Périphériques)
│
├── td_n5
│   ├── exercice1 (Modélisation Cinéma : Cinema 1 ↔ 1..* Salle, Projection, Film)
│   └── exercice2 (Système de Véhicules : Véhicule abstrait, Interfaces Maritime/Aerien)
│
└── td_n6
    └── exercice1 (Modélisation d'outils : Pen, Corps, Stylo, Feutre, Bouchon)

```

---

## 🚀 Exécution des Exercices

Chaque module contient une méthode de test `main()` (ou une classe principale dédiée) exécutable de deux manières :

### 1. Via les arguments de la ligne de commande (CLI)

Certains exercices (comme le TD2) attendent des paramètres directs lors du lancement.
*Exemple pour la création d'un Segment :*

```bash
javac sn/uasz/tp/td_n2/exercice2/Segment.java
java sn.uasz.tp.td_n2.exercice2.Segment 1 4 2 5

```

### 2. Mode interactif (Console Scanner)

Pour tester les opérations dynamiques (comme le débit d'un compte ou l'ajout de composants).

```bash
java sn.uasz.tp.td_n2.exercice1.Banque "12345-X" "Ibrahima Massaly" 500000

```

---

## 📝 Exemple de Focus Métier : Le modèle Cinéma (TD5)

Le package `td_n5.exercice1` illustre parfaitement la traduction d'un diagramme de classes UML complexe en code Java :

1. **Composition Forte :** On ne peut pas instancier une `Salle` de l'extérieur sans l'attacher à un `Cinema` existant (`cinema.ajouterSalle("RIO 01", 100);`).
2. **Classe d'association :** La classe `Projection` sert de pivot pour planifier un `Film` dans une `Salle` à un instant `(jour, heure)` précis.

---

## 👨‍💻 Développeur

* **Nom :** Massaly
* **GitHub :** [@Massaly2609](https://www.google.com/search?q=https://github.com/Massaly2609)
* **Établissement :** Université Assane Seck de Ziguinchor (UASZ)
* **Niveau :** Master 1 Informatique ~ Genie Logicel
