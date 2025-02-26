package utils;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ReadVar {

    /**
     * Permet de demander à l'utilisateur de saisir un entier (int)
     * 
     * @param message : message à afficher
     * @return int : l'entier saisi par l'utilisateur
     */
    public static int readInt(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            try {
                int result = sc.nextInt();
                sc.nextLine(); // Consommer le retour à la ligne
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Erreur : Veuillez saisir un entier valide.");
                sc.next(); // Consomme la saisie erronée
            }
        }
    }


    /**
     * Permet de demander à l'utilisateur de saisir un double
     * 
     * @param message : message à afficher
     * @return double : le double saisi par l'utilisateur
     */
    public static double readDouble(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = sc.nextLine();
            // Remplacer la virgule par un point pour gérer les deux séparateurs
            input = input.replace(',', '.');
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Erreur : Veuillez saisir un nombre (double) valide.");
            }
        }
    }
    
    /**
     * Permet de demander à l'utilisateur de saisir une chaîne de caractères
     * (String)
     * 
     * @param message : message à afficher
     * @return String : la chaîne de caractère saisie par l'utilisateur
     */
    public static String readString(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
    
    /**
     * Permet de demander à l'utilisateur de saisir un caractère (char)
     * 
     * @param message : message à afficher
     * @return char : le caractère saisi par l'utilisateur
     */
    public static char readChar(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String input = sc.nextLine();
        if (input.length() == 1) {
            return input.charAt(0);
        } else {
            System.out.println("Erreur : Veuillez saisir un seul caractère.");
            return readChar(message);
        }
    }
    
    /**
     * Permet de demander à l'utilisateur de saisir un booléen (true ou false)
     * 
     * @param message : message à afficher
     * @return boolean : le booléen saisi par l'utilisateur
     */
    public static boolean readBoolean(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (true) {
            String valid = "y";
            String invalid = "n";

            System.out.print(" (" + valid + " / " + invalid + ") " + message);
            String saisie = sc.nextLine();
            if (saisie.equalsIgnoreCase(valid)) {
                return true;
            } else if (saisie.equalsIgnoreCase(invalid)) {
                return false;
            } else {
                System.out.println("Erreur : Veuillez saisir '" + valid + "' ou '" + invalid + "'.");
            }
        }
    }
}
