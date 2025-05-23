# TP – Injection de Dépendances (Spring & Mini Framework Java)

Ce projet regroupe **deux parties complémentaires** sur l'injection de dépendances en Java :

1. **Partie 1 – Utilisation de Spring Framework**
2. **Partie 2 – Développement d’un mini-framework personnalisé (type Spring IoC)**
3.  Partie 1 – Comprendre l’injection des dépendances avec Spring
Cette première partie consiste à implémenter manuellement puis à automatiser l’injection de dépendances entre composants métiers via différentes approches.

Étapes clés :
Interfaces de base

Création de IDao avec une méthode getData()

Création de IMetier avec une méthode calcul()

Implémentation avec couplage faible

L’implémentation de IMetierImpl dépend de l’interface IDao et non d’une classe concrète

Techniques d’injection des dépendances

Instanciation statique 

Instanciation dynamique (via newInstance())

Utilisation de Spring :

Version XML

Version Annotations (@Component et @Autowired)

 Partie 2 – Mini Framework IoC maison
Cette deuxième partie consiste à développer un mini-framework d’injection des dépendances, similaire au conteneur IoC de Spring.

Fonctionnalités attendues :
Configuration par XML
Configuration par annotations

Reconnaissance d’annotations personnalisées (@Component et @Autowired)

Trois modes d’injection pris en charge

Par constructeur

Par setter

Par champ


---
#Dans la partie 2 nous avons :
#<img width="458" alt="image" src="https://github.com/user-attachments/assets/74b26012-06e8-4854-a39b-d0be069bf52d" />

#<img width="421" alt="image" src="https://github.com/user-attachments/assets/b8105f9f-5eaf-4035-b6fd-f9a349d84422" />

