
import java.util.Scanner;

class SheetPlayer {
    private String nom_joueur;
    private int round;
    private int[] score = new int[7];

    public SheetPlayer() {
        this.nom_joueur = "Salade";
        this.round = 1;
        for (int i = 0; i <= 6; i++) {
            this.score[i] = 0; // -1 pour indiquer que la figure n'a pas encore été jouée
            // Il faudrait afficher "-" quand la value de score == -1
            // Et empécher le joueur de sélectionner la figure si score != -1
        }
    }

    public void printScore() {
        System.out.println("----------------------------");
        System.out.println("Player : " + this.nom_joueur + " round : " + this.round);
        System.out.println("----------------------------");
        System.out.println("[a] sum of 1 : " + score[1]);
        System.out.println("[b] sum of 2 : " + score[2]);
        System.out.println("[c] sum of 3 : " + score[3]);
        System.out.println("[e] sum of 4 : " + score[4]);
        System.out.println("[f] sum of 5 : " + score[5]);
        System.out.println("[g] sum of 6 : " + score[6]);
        System.out.println("Total : " + score[0]);
        System.out.println("----------------------------");
    }

    public String askFigure(Scanner sc) {
        System.out.println(" Indicates the figure you want to play (abcdef) : ");
        String choice = sc.nextLine();
        return choice;
    }

    // c'est de la merde ça!!!!!
    // Je suis pas d'accord
    public void updateScoring(String choice, YamsDice askDice) {

    }
}
