

import utils.readVar;

public class Tests {
    public static void main(String[] args) {
        System.out.println(readVar.readInt("Saisir un entier : "));
        System.out.println(readVar.readBoolean("Saisir un boolean : "));
        System.out.println(readVar.readDouble("Saisir un double : "));
        System.out.println(readVar.readString("Saisir une chaine de caractères : "));
        System.out.println(readVar.readChar("Saisir un caractère : "));
    }
}
