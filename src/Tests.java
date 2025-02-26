import utils.*;

public class Tests {
    public static void main(String[] args) {
        // System.out.println(ReadVar.readInt("Saisir un entier : "));
        // System.out.println(ReadVar.readBoolean("Saisir un boolean : "));
        // System.out.println(ReadVar.readDouble("Saisir un double : "));
        // System.out.println(ReadVar.readString("Saisir une chaine de caractères : "));
        // System.out.println(ReadVar.readChar("Saisir un caractère : "));


        String[] menu = {"Option 1", "Option 2", "Option 3"};
        MenuCreator.displayMenu(menu);
        System.out.println(MenuCreator.readChoice(menu));

    }
}
