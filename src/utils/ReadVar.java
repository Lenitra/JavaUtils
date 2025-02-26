package utils; // Déclare le package utils

import java.util.Scanner; // Importe la classe Scanner pour la lecture des entrées utilisateur
import java.util.InputMismatchException; // Importe l'exception InputMismatchException pour gérer les erreurs de saisie

public class ReadVar { // Déclaration de la classe ReadVar

    /**
     * Permet de demander à l'utilisateur de saisir un entier (int)
     * @param message : message à afficher
     * @return int : l'entier saisi par l'utilisateur
     */
    public static int readInt(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); // Crée une nouvelle instance de Scanner pour lire depuis System.in
        while (true) { // Démarre une boucle infinie jusqu'à obtenir une saisie correcte
            System.out.print(message); // Affiche le message à l'utilisateur sans retour à la ligne
            try {
                int result = sc.nextInt(); // Tente de lire un entier
                sc.nextLine(); // Consomme le retour à la ligne restant dans le buffer
                return result; // Retourne l'entier saisi si la lecture est réussie
            } catch (InputMismatchException e) { // Intercepte l'exception en cas de mauvaise saisie
                System.out.println("Erreur : Veuillez saisir un entier valide."); // Informe l'utilisateur de l'erreur
                sc.next(); // Consomme la saisie erronée pour éviter une boucle infinie
            }
        }
    }

    /**
     * Permet de demander à l'utilisateur de saisir un double
     * @param message : message à afficher
     * @return double : le double saisi par l'utilisateur
     */
    public static double readDouble(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); // Crée une nouvelle instance de Scanner pour lire depuis System.in
        while (true) { // Boucle infinie jusqu'à ce qu'une saisie correcte soit fournie
            System.out.print(message); // Affiche le message à l'utilisateur sans retour à la ligne
            String input = sc.nextLine(); // Lit la saisie de l'utilisateur sous forme de chaîne de caractères
            // Remplace la virgule par un point pour gérer les deux séparateurs décimaux
            input = input.replace(',', '.');
            try {
                return Double.parseDouble(input); // Tente de convertir la chaîne normalisée en double et le retourne
            } catch (NumberFormatException e) { // Si la conversion échoue, intercepte l'exception
                System.out.println("Erreur : Veuillez saisir un nombre (double) valide."); // Affiche un message d'erreur
            }
        }
    }
    
    /**
     * Permet de demander à l'utilisateur de saisir une chaîne de caractères (String)
     * @param message : message à afficher
     * @return String : la chaîne de caractère saisie par l'utilisateur
     */
    public static String readString(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); // Crée une nouvelle instance de Scanner pour lire depuis System.in
        System.out.print(message); // Affiche le message à l'utilisateur sans retour à la ligne
        return sc.nextLine(); // Retourne la chaîne saisie par l'utilisateur
    }
    
    /**
     * Permet de demander à l'utilisateur de saisir un caractère (char)
     * @param message : message à afficher
     * @return char : le caractère saisi par l'utilisateur
     */
    public static char readChar(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); // Crée une nouvelle instance de Scanner pour lire depuis System.in
        System.out.print(message); // Affiche le message à l'utilisateur sans retour à la ligne
        String input = sc.nextLine(); // Lit la saisie de l'utilisateur sous forme de chaîne
        if (input.length() == 1) { // Vérifie que la chaîne saisie contient exactement un caractère
            return input.charAt(0); // Retourne le caractère si la condition est respectée
        } else {
            System.out.println("Erreur : Veuillez saisir un seul caractère."); // Informe l'utilisateur en cas d'erreur
            return readChar(message); // Relance la méthode récursivement pour obtenir une saisie valide
        }
    }
    
    /**
     * Permet de demander à l'utilisateur de saisir un booléen (true ou false)
     * @param message : message à afficher
     * @return boolean : le booléen saisi par l'utilisateur
     */
    public static boolean readBoolean(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); // Crée une nouvelle instance de Scanner pour lire depuis System.in
        while (true) { // Boucle infinie jusqu'à ce que l'utilisateur saisisse une valeur valide
            String valid = "y"; // Chaîne représentant la saisie valide pour true
            String invalid = "n"; // Chaîne représentant la saisie valide pour false

            // Affiche le prompt avec les options (y / n) suivies du message
            System.out.print(" (" + valid + " / " + invalid + ") " + message);
            String saisie = sc.nextLine(); // Lit la saisie de l'utilisateur
            if (saisie.equalsIgnoreCase(valid)) { // Si la saisie correspond à "y" (insensible à la casse)
                return true; // Retourne true
            } else if (saisie.equalsIgnoreCase(invalid)) { // Si la saisie correspond à "n" (insensible à la casse)
                return false; // Retourne false
            } else {
                System.out.println("Erreur : Veuillez saisir '" + valid + "' ou '" + invalid + "'."); // Message d'erreur si la saisie est incorrecte
            }
        }
    }
}
