package utils;

public class MenuCreator {

    public static void displayMenu(String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
    }

    public static int readChoice(String[] menu) {
        int choice = ReadVar.readInt("Votre choix : ");
        while (choice < 1 || choice > menu.length) {
            System.out.println("Erreur : Veuillez saisir un choix valide.");
            choice = ReadVar.readInt("Votre choix : ");
        }
        return choice;
    }

    public static int displayMenuAndReadChoice(String[] menu) {
        displayMenu(menu);
        return readChoice(menu);
    }

}
