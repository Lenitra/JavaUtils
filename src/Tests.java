import utils.*;

public class Tests {
    public static void main(String[] args) {
        // System.out.println(ReadVar.readInt("Saisir un entier : "));
        // System.out.println(ReadVar.readBoolean("Saisir un boolean : "));
        // System.out.println(ReadVar.readDouble("Saisir un double : "));
        // System.out.println(ReadVar.readString("Saisir une chaine de caractères : "));
        // System.out.println(ReadVar.readChar("Saisir un caractère : "));


        String[] menu = {"Banane", "Cerises", "Kiwi", "Pomme", "Raisin"};
        MenuCreator.displayMenu(menu, "---- MENU 1 ----");
        int choix = MenuCreator.readChoice(menu);
        System.out.println("Vous avez choisi : " + menu[choix - 1]);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        choix = MenuCreator.displayMenuAndReadChoice(menu, "---- MENU 2 ----");
        System.out.println("Vous avez choisi : " + menu[choix - 1]);


    }
}
