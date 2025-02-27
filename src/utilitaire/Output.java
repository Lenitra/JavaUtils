package utilitaire;

import java.util.HashMap;
import java.util.Map;

public class Output {

    public static void clear() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    
    // Code ANSI pour réinitialiser la couleur
    public static final String RESET = "\u001B[0m";
    public static final char colorPrefix = '&';
    // Association des codes Minecraft aux codes ANSI
    private static final Map<Character, String> colorMap = new HashMap<>();
    static {
        colorMap.put('0', "\u001B[30m"); // Noir
        colorMap.put('1', "\u001B[34m"); // Bleu foncé
        colorMap.put('2', "\u001B[32m"); // Vert foncé
        colorMap.put('3', "\u001B[36m"); // Aqua foncé
        colorMap.put('4', "\u001B[31m"); // Rouge foncé
        colorMap.put('5', "\u001B[35m"); // Violet foncé
        colorMap.put('6', "\u001B[33m"); // Or
        colorMap.put('7', "\u001B[37m"); // Gris clair
        colorMap.put('8', "\u001B[90m"); // Gris foncé
        colorMap.put('9', "\u001B[94m"); // Bleu clair
        colorMap.put('a', "\u001B[92m"); // Vert clair
        colorMap.put('b', "\u001B[96m"); // Aqua clair
        colorMap.put('c', "\u001B[91m"); // Rouge clair
        colorMap.put('d', "\u001B[95m"); // Violet clair
        colorMap.put('e', "\u001B[93m"); // Jaune
        colorMap.put('f', "\u001B[97m"); // Blanc
        colorMap.put('r', RESET); // Blanc
        // Vous pouvez étendre cette map pour d'autres codes ou styles
    }

    public static void printWithColors(String message) {
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == colorPrefix && i < message.length() - 1) {
                char code = message.charAt(i + 1);
                String ansiCode = colorMap.get(code);
                if (ansiCode != null) {
                    formatted.append(ansiCode);
                    i++; // Passe le caractère de code
                    continue;
                }
            }
            formatted.append(c);
        }
        // Réinitialisation à la fin du message
        formatted.append(RESET);
        System.out.println(formatted.toString());
    }


    public static void printWithColorsRDM(String message) {
        // pour chaque caractère du message ajouter § suivi d'un chiffre aléatoire entre 0 et 9 puis le caractère
        StringBuilder formatted = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            formatted.append(colorPrefix).append((int) (Math.random() * 10)).append(c);
        }
        printWithColors(formatted.toString());

    }

    public static void waitUntilEnter() {
        Output.printWithColors("Appuyez sur &4Entrée pour continuer...");
        ReadVar.readString("");
    }



    public static void animatedTyping(String message, int delay) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }


    public static void animatedColor(String message, int delaySeconds) {
        int changeColorPerSeconds = 15;

        int sleepBeforeChange = 1000 / changeColorPerSeconds;  

        for (int i = 0; i < delaySeconds * changeColorPerSeconds; i++) {
            clear();
            printWithColorsRDM(message);
            try {
                Thread.sleep(sleepBeforeChange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        clear();
        System.out.println(message);
    }


}
