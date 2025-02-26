# JavaUtils

Ce projet est un package Java d'utilitaires, incluant des fonctionnalités telles que la gestion de menu console et un système de demandes de saisies utilisateur

## Fonctionnalités

- **Gestion de menu console** : Créez et gérez des menus interactifs dans la console.
- **Demande de saisies utilisateur** : Demandez des variables à l'utilisateur avec des méthodes simples et intuitives.

## Installation

Clonez le dépôt et ajoutez le package à votre projet Java.

```bash
git clone https://github.com/votre-utilisateur/JavaUtils.git
```

## Utilisation

### Gestion de menu console

```java
import utils.MenuCreator;

public class Main {
    public static void main(String[] args) {
        String[] menu = {"Option 1", "Option 2", "Option 3"};
        int choice = MenuCreator.displayMenuAndReadChoice(menu, "Titre du Menu");
        System.out.println("Vous avez choisi l'option : " + choice);
    }
}
```

### readVar

```java
import utils.ReadVar;

public class Main {
    public static void main(String[] args) {
        int entier = ReadVar.readInt("Veuillez saisir un entier : ");
        double decimal = ReadVar.readDouble("Veuillez saisir un double : ");
        String texte = ReadVar.readString("Veuillez saisir une chaîne de caractères : ");
        char caractere = ReadVar.readChar("Veuillez saisir un caractère : ");
        boolean booleen = ReadVar.readBoolean("Veuillez saisir un booléen (y/n) : ");

        System.out.println("Entier saisi : " + entier);
        System.out.println("Double saisi : " + decimal);
        System.out.println("Texte saisi : " + texte);
        System.out.println("Caractère saisi : " + caractere);
        System.out.println("Booléen saisi : " + booleen);
    }
}
```

## Contribuer

Les contributions sont les bienvenues. Veuillez soumettre une pull request ou ouvrir une issue pour discuter des changements que vous souhaitez apporter.