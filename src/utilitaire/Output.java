package utilitaire;

public class Output {

    public static void clear() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
