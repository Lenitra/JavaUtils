package utils; // Déclaration du package utils

public class MenuCreator { // Déclaration de la classe MenuCreator

    // Méthode pour afficher un menu à partir d'un tableau de chaînes (sans titre)
    public static void displayMenu(String[] menu) {
        // Boucle pour parcourir l'ensemble des éléments du tableau menu
        for (int i = 0; i < menu.length; i++) {
            // Affiche le numéro de l'option (i+1) suivi du texte correspondant à l'élément du menu
            System.out.println((i + 1) + ". " + menu[i]);
        }
    }

    // Méthode pour afficher un menu avec un titre et un tableau de chaînes
    public static void displayMenu(String[] menu, String titre) {
        // Affiche le titre du menu
        System.out.println(titre);
        // Boucle pour parcourir l'ensemble des éléments du tableau menu
        for (int i = 0; i < menu.length; i++) {
            // Affiche le numéro de l'option (i+1) suivi du texte correspondant à l'élément du menu
            System.out.println((i + 1) + ". " + menu[i]);
        }
    }

    // Méthode pour lire le choix de l'utilisateur et valider que ce choix est correct
    public static int readChoice(String[] menu) {
        // Demande à l'utilisateur de saisir son choix en utilisant la méthode readInt de la classe ReadVar
        int choice = ReadVar.readInt("Votre choix : ");
        // Boucle de validation : tant que le choix n'est pas compris entre 1 et le nombre d'options du menu
        while (choice < 1 || choice > menu.length) {
            // Affiche un message d'erreur en cas de saisie invalide
            System.out.println("Erreur : Veuillez saisir un choix valide.");
            // Redemande à l'utilisateur de saisir son choix
            choice = ReadVar.readInt("Votre choix : ");
        }
        // Retourne le choix valide de l'utilisateur
        return choice;
    }

    // Méthode combinant l'affichage du menu et la lecture du choix de l'utilisateur (sans titre)
    public static int displayMenuAndReadChoice(String[] menu) {
        // Affiche le menu en appelant la méthode displayMenu
        displayMenu(menu);
        // Lit et retourne le choix de l'utilisateur en appelant la méthode readChoice
        return readChoice(menu);
    }

    // Méthode combinant l'affichage d'un menu avec titre et la lecture du choix de l'utilisateur
    public static int displayMenuAndReadChoice(String[] menu, String titre) {
        // Affiche le menu avec le titre en appelant la méthode displayMenu
        displayMenu(menu, titre);
        // Lit et retourne le choix de l'utilisateur en appelant la méthode readChoice
        return readChoice(menu);
    }

}
