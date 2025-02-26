package commons.utils;

import java.util.Scanner;

public class LecureConsole {

    private static Scanner lectureClavier = new Scanner(System.in);


    public static int lectureChoisInt(final int index1, final int index2) {

        int choix = -1;

        boolean boucle = true;

        do{
            boucle = false;

            choix = lectureClavier.nextInt();


            if (choix < index1 || choix > index2){
                System.out.println("Erreur de saisie, veuillez recommencer :");
                boucle = true;
            }


        }while (boucle);

        return choix;
    }
}
