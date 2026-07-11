# 🎓 Travaux Dirigés & Pratiques - Programmation Orientée Objet (Java)

Ce dépôt regroupe l'ensemble des travaux dirigés (TD), travaux pratiques (TP) et évaluations continues réalisés dans le cadre du module de **Programmation Orientée Objet (POO)** en **Master 1 Informatique** à l'**Université Assane Seck de Ziguinchor (UASZ)**.

L'objectif de ce projet est de consolider les concepts fondamentaux de la POO en Java, allant de l'encapsulation de base à la modélisation UML complexe (associations, agrégations, compositions fortes, héritage et interfaces).

---

## 🛠️ Concepts POO Maîtrisés & Implémentés

* **Encapsulation stricte :** Utilisation systématique d'attributs `private` ou `protected` combinés avec accesseurs (`get`) et mutateurs (`set`).
* **Gestion des Multiplicités et Associations :**
    * Relations uniques (`1..1` ou `0..1`) par référence d'objet directe (ex: package `association_01`).
    * Relations multiples (`0..*` ou `1..*`) gérées dynamiquement via des structures de collections comme `ArrayList<E>`.
* **Cycle de vie des objets :**
    * **Composition ($\blacklozenge$) :** Instanciation interne forte assurant la dépendance du cycle de vie (ex: Les `Salle` créées directement via l'objet `Cinema`).
    * **Agrégation ($\diamondsuit$) :** Associations d'objets indépendants à cycle de vie autonome (ex: Relation `Feutre` $\leftrightarrow$ `Bouchon`).
* **Classes d'association :** Matérialisation de relations complexes porteuses d'attributs métier temporels (ex: la classe `Projection` unissant `Salle` et `Film`).
* **Polymorphisme, Abstraction & Spécialisation :**
    * Mécanismes d'héritage (`extends`) avec délégation aux constructeurs parents (`super()`) et redéfinitions de comportements (`@Override`).
    * Exploitation de classes abstraites (`abstract class`) pour imposer des cadres de calculs de tarifications ou de physiques partagées.

---

## 📂 Architecture détaillée de la Solution

Le code source est structuré en modules logiques via des sous-packages sous le namespace racine `sn.uasz` :

```text
sn.uasz
├── applicationcours.abstraiteimplements ── Modélisation générique de transport/marchandises.
├── association_01                       ── Démo d'association basique d'objets (Personne ↔ Compte).
├── devoir                               ── Évaluations formelles de session
│   ├── exo1                             ── Tarification polymorphe de fret (Routier, Aérien, Urgent).
│   └── exo2                             ── Gestion de Cinéma via composition et classe d'association.
└── tp                                   ── Travaux pratiques et fiches de TD dirigées
    ├── td_n2
    │   ├── exo1                         ── Modélisation bancaire fondamentale (Banque & CompteBancaire).
    │   └── exo2                         ── Géométrie vectorielle plane (Point & Segment).
    ├── td_n3                            ── Modélisation du domaine médical (Medecin, Patient, Maladie).
    ├── td_n4
    │   ├── exo1                         ── Hiérarchie RH d'entreprise (Personne → Employe → Chef → Directeur).
    │   └── exo2                         ── Gestion de stock informatique (Matériels, PC_Portable, Imprimante).
    ├── td_n5
    │   ├── exercice1                    ── Variante de gestion de billetterie cinéma et planification.
    │   └── exercice2                    ── Polymorphisme de motopropulseurs multi-milieux (Hydravion, Hydroglisseur).
    └── td_n6                            ── Cas d'école d'agrégation et d'héritage (Stylos, Feutres, Bouchon).

```

---

## 🚀 Compilation et Exécution des Modules

Le projet est configuré pour être exécuté nativement depuis un IDE (IntelliJ IDEA, Eclipse) ou directement depuis un terminal à la racine du dossier `src`.

Chaque sous-module intègre un point d'entrée exécutable autonome (`Test.java`, `Main.java` ou `Principal.java`).

### Compilation globale

Pour compiler l'intégralité du projet depuis le dossier `src` :

```bash
cd src
javac sn/uasz/tp/*/*.java sn/uasz/devoir/*/*.java

```

### Exemples d'exécution en ligne de commande

* **Pour lancer l'évaluation sur les Transports (Devoir Exo 1) :**
```bash
java sn.uasz.devoir.exo1.Test

```


* **Pour lancer la gestion de Matériels Informatiques (TD4 Exo 2) :**
```bash
java sn.uasz.tp.td_n4.exo2.Test

```


* **Pour lancer le cas d'étude du Feutre et son Bouchon (TD6) :**
```bash
java sn.uasz.tp.td_n6.Main

```



---

## 👨‍💻 Développeur

* **Nom :** Massaly
* **GitHub :** [@Massaly2609](https://www.google.com/search?q=https://github.com/Massaly2609)
* **Établissement :** Université Assane Seck de Ziguinchor (UASZ)
* **Niveau :** Master 1 Informatique ~ Génie Logiciel

```

```Voici la version mise à jour, propre et complète de ton fichier `README.md`, recalibrée pour correspondre exactement à l'arborescence réelle de ton projet `IdeaProjects\TP__POO`.

J'ai corrigé les chemins des packages (notamment l'intégration des dossiers `devoir`, `association_01` et `applicationcours`), restructuré la section architecture et nettoyé les exemples de commandes CLI pour qu'ils collent à tes fichiers de tests réels (`Test.java`, `Principal.java`, etc.).

---

```markdown
# File Tree: TP__POO

**Last Updated:** 11/07/2026
**Root Path:** `c:\Users\DELL\IdeaProjects\TP__POO`


```

├── 📁 src
│   ├── 📁 sn
│   │   └── 📁 uasz
│   │       ├── 📁 applicationcours
│   │       │   └── 📁 abstraiteimplements
│   │       │       ├── ☕ Aerien.java
│   │       │       ├── ☕ Main_marchandise.java
│   │       │       ├── ☕ Marchandise.java
│   │       │       ├── ☕ Routiere.java
│   │       │       ├── ☕ Transport.java
│   │       │       └── ☕ Urgent.java
│   │       ├── 📁 association_01
│   │       │   ├── ☕ Compte.java
│   │       │   └── ☕ Personne.java
│   │       ├── 📁 devoir
│   │       │   ├── 📁 exo1
│   │       │   │   ├── ☕ Aerien.java
│   │       │   │   ├── ☕ Marchandise.java
│   │       │   │   ├── ☕ Routier.java
│   │       │   │   ├── ☕ Test.java
│   │       │   │   ├── ☕ Transport.java
│   │       │   │   └── ☕ Urgent.java
│   │       │   └── 📁 exo2
│   │       │       ├── ☕ Cinema.java
│   │       │       ├── ☕ Film.java
│   │       │       ├── ☕ Projection.java
│   │       │       ├── ☕ Salle.java
│   │       │       └── ☕ Test.java
│   │       └── 📁 tp
│   │           ├── 📁 td_n2
│   │           │   ├── 📁 exo1
│   │           │   │   ├── ☕ Banque.java
│   │           │   │   └── ☕ CompteBancaire.java
│   │           │   └── 📁 exo2
│   │           │       ├── ☕ Point.java
│   │           │       └── ☕ Segment.java
│   │           ├── 📁 td_n3
│   │           │   ├── ☕ Maladie.java
│   │           │   ├── ☕ Man.java
│   │           │   ├── ☕ Medecin.java
│   │           │   └── ☕ Patient.java
│   │           ├── 📁 td_n4
│   │           │   ├── 📁 exo1
│   │           │   │   ├── ☕ Chef.java
│   │           │   │   ├── ☕ Directeur.java
│   │           │   │   ├── ☕ Employe.java
│   │           │   │   ├── ☕ Personne.java
│   │           │   │   └── ☕ Principal.java
│   │           │   └── 📁 exo2
│   │           │       ├── ☕ Imprimante.java
│   │           │       ├── ☕ Ordinateur.java
│   │           │       ├── ☕ Pc_Bureau.java
│   │           │       ├── ☕ Pc_Portable.java
│   │           │       ├── ☕ Peripherique.java
│   │           │       ├── ☕ Produit_Informatique.java
│   │           │       ├── ☕ Scanner_Informatique.java
│   │           │       └── ☕ Test.java
│   │           ├── 📁 td_n5
│   │           │   ├── 📁 exercice1
│   │           │   │   ├── ☕ Cinema.java
│   │           │   │   ├── ☕ Film.java
│   │           │   │   ├── ☕ Projection.java
│   │           │   │   ├── ☕ Salle.java
│   │           │   │   └── ☕ pincipal_cinema.java
│   │           │   └── 📁 exercice2
│   │           │       ├── ☕ Aerien.java
│   │           │       ├── ☕ Hydravion.java
│   │           │       ├── ☕ Hydroglisseur.java
│   │           │       ├── ☕ Maritine.java
│   │           │       ├── ☕ Terrestre.java
│   │           │       └── ☕ Vehicule.java
│   │           └── 📁 td_n6
│   │               ├── ☕ Bouchon.java
│   │               ├── ☕ Corps.java
│   │               ├── ☕ Feutre.java
│   │               ├── ☕ Main.java
│   │               ├── ☕ Pen.java
│   │               └── ☕ Stylo.java
│   └── ☕ Main.java

```

---

# 🎓 Travaux Dirigés & Pratiques - Programmation Orientée Objet (Java)

Ce dépôt regroupe l'ensemble des travaux dirigés (TD), travaux pratiques (TP) et évaluations continues réalisés dans le cadre du module de **Programmation Orientée Objet (POO)** en **Master 1 Informatique** à l'**Université Assane Seck de Ziguinchor (UASZ)**.

L'objectif de ce projet est de consolider les concepts fondamentaux de la POO en Java, allant de l'encapsulation de base à la modélisation UML complexe (associations, agrégations, compositions fortes, héritage et interfaces).

---

## 🛠️ Concepts POO Maîtrisés & Implémentés

* **Encapsulation stricte :** Utilisation systématique d'attributs `private` ou `protected` combinés avec accesseurs (`get`) et mutateurs (`set`).
* **Gestion des Multiplicités et Associations :**
    * Relations uniques (`1..1` ou `0..1`) par référence d'objet directe (ex: package `association_01`).
    * Relations multiples (`0..*` ou `1..*`) gérées dynamiquement via des structures de collections comme `ArrayList<E>`.
* **Cycle de vie des objets :**
    * **Composition ($\blacklozenge$) :** Instanciation interne forte assurant la dépendance du cycle de vie (ex: Les `Salle` créées directement via l'objet `Cinema`).
    * **Agrégation ($\diamondsuit$) :** Associations d'objets indépendants à cycle de vie autonome (ex: Relation `Feutre` $\leftrightarrow$ `Bouchon`).
* **Classes d'association :** Matérialisation de relations complexes porteuses d'attributs métier temporels (ex: la classe `Projection` unissant `Salle` et `Film`).
* **Polymorphisme, Abstraction & Spécialisation :**
    * Mécanismes d'héritage (`extends`) avec délégation aux constructeurs parents (`super()`) et redéfinitions de comportements (`@Override`).
    * Exploitation de classes abstraites (`abstract class`) pour imposer des cadres de calculs de tarifications ou de physiques partagées.

---

## 📂 Architecture détaillée de la Solution

Le code source est structuré en modules logiques via des sous-packages sous le namespace racine `sn.uasz` :

```text
sn.uasz
├── applicationcours.abstraiteimplements ── Modélisation générique de transport/marchandises.
├── association_01                       ── Démo d'association basique d'objets (Personne ↔ Compte).
├── devoir                               ── Évaluations formelles de session
│   ├── exo1                             ── Tarification polymorphe de fret (Routier, Aérien, Urgent).
│   └── exo2                             ── Gestion de Cinéma via composition et classe d'association.
└── tp                                   ── Travaux pratiques et fiches de TD dirigées
    ├── td_n2
    │   ├── exo1                         ── Modélisation bancaire fondamentale (Banque & CompteBancaire).
    │   └── exo2                         ── Géométrie vectorielle plane (Point & Segment).
    ├── td_n3                            ── Modélisation du domaine médical (Medecin, Patient, Maladie).
    ├── td_n4
    │   ├── exo1                         ── Hiérarchie RH d'entreprise (Personne → Employe → Chef → Directeur).
    │   └── exo2                         ── Gestion de stock informatique (Matériels, PC_Portable, Imprimante).
    ├── td_n5
    │   ├── exercice1                    ── Variante de gestion de billetterie cinéma et planification.
    │   └── exercice2                    ── Polymorphisme de motopropulseurs multi-milieux (Hydravion, Hydroglisseur).
    └── td_n6                            ── Cas d'école d'agrégation et d'héritage (Stylos, Feutres, Bouchon).

```

---

## 🚀 Compilation et Exécution des Modules

Le projet est configuré pour être exécuté nativement depuis un IDE (IntelliJ IDEA, Eclipse) ou directement depuis un terminal à la racine du dossier `src`.

Chaque sous-module intègre un point d'entrée exécutable autonome (`Test.java`, `Main.java` ou `Principal.java`).

### Compilation globale

Pour compiler l'intégralité du projet depuis le dossier `src` :

```bash
cd src
javac sn/uasz/tp/*/*.java sn/uasz/devoir/*/*.java

```

### Exemples d'exécution en ligne de commande

* **Pour lancer l'évaluation sur les Transports (Devoir Exo 1) :**
```bash
java sn.uasz.devoir.exo1.Test

```


* **Pour lancer la gestion de Matériels Informatiques (TD4 Exo 2) :**
```bash
java sn.uasz.tp.td_n4.exo2.Test

```


* **Pour lancer le cas d'étude du Feutre et son Bouchon (TD6) :**
```bash
java sn.uasz.tp.td_n6.Main

```



---

## 👨‍💻 Développeur

* **Nom :** Massaly
* **GitHub :** [@Massaly2609](https://www.google.com/search?q=https://github.com/Massaly2609)
* **Établissement :** Université Assane Seck de Ziguinchor (UASZ)
* **Niveau :** Master 1 Informatique ~ Génie Logiciel

```

```Voici la version mise à jour, propre et complète de ton fichier `README.md`, recalibrée pour correspondre exactement à l'arborescence réelle de ton projet `IdeaProjects\TP__POO`.

J'ai corrigé les chemins des packages (notamment l'intégration des dossiers `devoir`, `association_01` et `applicationcours`), restructuré la section architecture et nettoyé les exemples de commandes CLI pour qu'ils collent à tes fichiers de tests réels (`Test.java`, `Principal.java`, etc.).

---

```markdown
# File Tree: TP__POO

**Last Updated:** 11/07/2026
**Root Path:** `c:\Users\DELL\IdeaProjects\TP__POO`


```

├── 📁 src
│   ├── 📁 sn
│   │   └── 📁 uasz
│   │       ├── 📁 applicationcours
│   │       │   └── 📁 abstraiteimplements
│   │       │       ├── ☕ Aerien.java
│   │       │       ├── ☕ Main_marchandise.java
│   │       │       ├── ☕ Marchandise.java
│   │       │       ├── ☕ Routiere.java
│   │       │       ├── ☕ Transport.java
│   │       │       └── ☕ Urgent.java
│   │       ├── 📁 association_01
│   │       │   ├── ☕ Compte.java
│   │       │   └── ☕ Personne.java
│   │       ├── 📁 devoir
│   │       │   ├── 📁 exo1
│   │       │   │   ├── ☕ Aerien.java
│   │       │   │   ├── ☕ Marchandise.java
│   │       │   │   ├── ☕ Routier.java
│   │       │   │   ├── ☕ Test.java
│   │       │   │   ├── ☕ Transport.java
│   │       │   │   └── ☕ Urgent.java
│   │       │   └── 📁 exo2
│   │       │       ├── ☕ Cinema.java
│   │       │       ├── ☕ Film.java
│   │       │       ├── ☕ Projection.java
│   │       │       ├── ☕ Salle.java
│   │       │       └── ☕ Test.java
│   │       └── 📁 tp
│   │           ├── 📁 td_n2
│   │           │   ├── 📁 exo1
│   │           │   │   ├── ☕ Banque.java
│   │           │   │   └── ☕ CompteBancaire.java
│   │           │   └── 📁 exo2
│   │           │       ├── ☕ Point.java
│   │           │       └── ☕ Segment.java
│   │           ├── 📁 td_n3
│   │           │   ├── ☕ Maladie.java
│   │           │   ├── ☕ Man.java
│   │           │   ├── ☕ Medecin.java
│   │           │   └── ☕ Patient.java
│   │           ├── 📁 td_n4
│   │           │   ├── 📁 exo1
│   │           │   │   ├── ☕ Chef.java
│   │           │   │   ├── ☕ Directeur.java
│   │           │   │   ├── ☕ Employe.java
│   │           │   │   ├── ☕ Personne.java
│   │           │   │   └── ☕ Principal.java
│   │           │   └── 📁 exo2
│   │           │       ├── ☕ Imprimante.java
│   │           │       ├── ☕ Ordinateur.java
│   │           │       ├── ☕ Pc_Bureau.java
│   │           │       ├── ☕ Pc_Portable.java
│   │           │       ├── ☕ Peripherique.java
│   │           │       ├── ☕ Produit_Informatique.java
│   │           │       ├── ☕ Scanner_Informatique.java
│   │           │       └── ☕ Test.java
│   │           ├── 📁 td_n5
│   │           │   ├── 📁 exercice1
│   │           │   │   ├── ☕ Cinema.java
│   │           │   │   ├── ☕ Film.java
│   │           │   │   ├── ☕ Projection.java
│   │           │   │   ├── ☕ Salle.java
│   │           │   │   └── ☕ pincipal_cinema.java
│   │           │   └── 📁 exercice2
│   │           │       ├── ☕ Aerien.java
│   │           │       ├── ☕ Hydravion.java
│   │           │       ├── ☕ Hydroglisseur.java
│   │           │       ├── ☕ Maritine.java
│   │           │       ├── ☕ Terrestre.java
│   │           │       └── ☕ Vehicule.java
│   │           └── 📁 td_n6
│   │               ├── ☕ Bouchon.java
│   │               ├── ☕ Corps.java
│   │               ├── ☕ Feutre.java
│   │               ├── ☕ Main.java
│   │               ├── ☕ Pen.java
│   │               └── ☕ Stylo.java
│   └── ☕ Main.java

```

---

# 🎓 Travaux Dirigés & Pratiques - Programmation Orientée Objet (Java)

Ce dépôt regroupe l'ensemble des travaux dirigés (TD), travaux pratiques (TP) et évaluations continues réalisés dans le cadre du module de **Programmation Orientée Objet (POO)** en **Master 1 Informatique** à l'**Université Assane Seck de Ziguinchor (UASZ)**.

L'objectif de ce projet est de consolider les concepts fondamentaux de la POO en Java, allant de l'encapsulation de base à la modélisation UML complexe (associations, agrégations, compositions fortes, héritage et interfaces).

---

## 🛠️ Concepts POO Maîtrisés & Implémentés

* **Encapsulation stricte :** Utilisation systématique d'attributs `private` ou `protected` combinés avec accesseurs (`get`) et mutateurs (`set`).
* **Gestion des Multiplicités et Associations :**
    * Relations uniques (`1..1` ou `0..1`) par référence d'objet directe (ex: package `association_01`).
    * Relations multiples (`0..*` ou `1..*`) gérées dynamiquement via des structures de collections comme `ArrayList<E>`.
* **Cycle de vie des objets :**
    * **Composition ($\blacklozenge$) :** Instanciation interne forte assurant la dépendance du cycle de vie (ex: Les `Salle` créées directement via l'objet `Cinema`).
    * **Agrégation ($\diamondsuit$) :** Associations d'objets indépendants à cycle de vie autonome (ex: Relation `Feutre` $\leftrightarrow$ `Bouchon`).
* **Classes d'association :** Matérialisation de relations complexes porteuses d'attributs métier temporels (ex: la classe `Projection` unissant `Salle` et `Film`).
* **Polymorphisme, Abstraction & Spécialisation :**
    * Mécanismes d'héritage (`extends`) avec délégation aux constructeurs parents (`super()`) et redéfinitions de comportements (`@Override`).
    * Exploitation de classes abstraites (`abstract class`) pour imposer des cadres de calculs de tarifications ou de physiques partagées.

---

## 📂 Architecture détaillée de la Solution

Le code source est structuré en modules logiques via des sous-packages sous le namespace racine `sn.uasz` :

```text
sn.uasz
├── applicationcours.abstraiteimplements ── Modélisation générique de transport/marchandises.
├── association_01                       ── Démo d'association basique d'objets (Personne ↔ Compte).
├── devoir                               ── Évaluations formelles de session
│   ├── exo1                             ── Tarification polymorphe de fret (Routier, Aérien, Urgent).
│   └── exo2                             ── Gestion de Cinéma via composition et classe d'association.
└── tp                                   ── Travaux pratiques et fiches de TD dirigées
    ├── td_n2
    │   ├── exo1                         ── Modélisation bancaire fondamentale (Banque & CompteBancaire).
    │   └── exo2                         ── Géométrie vectorielle plane (Point & Segment).
    ├── td_n3                            ── Modélisation du domaine médical (Medecin, Patient, Maladie).
    ├── td_n4
    │   ├── exo1                         ── Hiérarchie RH d'entreprise (Personne → Employe → Chef → Directeur).
    │   └── exo2                         ── Gestion de stock informatique (Matériels, PC_Portable, Imprimante).
    ├── td_n5
    │   ├── exercice1                    ── Variante de gestion de billetterie cinéma et planification.
    │   └── exercice2                    ── Polymorphisme de motopropulseurs multi-milieux (Hydravion, Hydroglisseur).
    └── td_n6                            ── Cas d'école d'agrégation et d'héritage (Stylos, Feutres, Bouchon).

```

---

## 🚀 Compilation et Exécution des Modules

Le projet est configuré pour être exécuté nativement depuis un IDE (IntelliJ IDEA, Eclipse) ou directement depuis un terminal à la racine du dossier `src`.

Chaque sous-module intègre un point d'entrée exécutable autonome (`Test.java`, `Main.java` ou `Principal.java`).

### Compilation globale

Pour compiler l'intégralité du projet depuis le dossier `src` :

```bash
cd src
javac sn/uasz/tp/*/*.java sn/uasz/devoir/*/*.java

```

### Exemples d'exécution en ligne de commande

* **Pour lancer l'évaluation sur les Transports (Devoir Exo 1) :**
```bash
java sn.uasz.devoir.exo1.Test

```


* **Pour lancer la gestion de Matériels Informatiques (TD4 Exo 2) :**
```bash
java sn.uasz.tp.td_n4.exo2.Test

```


* **Pour lancer le cas d'étude du Feutre et son Bouchon (TD6) :**
```bash
java sn.uasz.tp.td_n6.Main

```



---

## 👨‍💻 Développeur

* **Nom :** Massaly
* **GitHub :** [@Massaly2609](https://www.google.com/search?q=https://github.com/Massaly2609)
* **Établissement :** Université Assane Seck de Ziguinchor (UASZ)
* **Niveau :** Master 1 Informatique ~ Génie Logiciel
