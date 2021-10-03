import java.util.Scanner;

class YamsDice {
    private int nb_dices;
    private Dice dices[];

    public YamsDice() {
        nb_dices = 5;
        dices = new Dice[nb_dices];
        for (int i = 0; i <= 4; i++) {
            dices[i] = new Dice();
        }
    }

    public YamsDice(int nb) {
        nb_dices = nb;
        dices = new Dice[nb_dices];
        for (int i = 0; i <= 4; i++) {
            dices[i] = new Dice();
        }
    }

    public void printYams() {
        System.out.print("Dice n°");
        for (int i = 1; i <= nb_dices; i++) {
            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.print("       ");
        for (int i = 0; i < this.nb_dices; i++) {
            dices[i].printDice();
        }
    }

    public String askDice(Scanner sc) {
        System.out.println("");
        System.out.println(" Indicates the dices you want to roll (12345) : ");
        String position = sc.nextLine();
        return position;
    }

    public void rollYams(String position) {
        for (int i = 1; i <= 5; i++) {
            if (position.contains(String.valueOf(i)) == true)
                dices[i - 1].roll();
        }
    }

    public int getScore(int index) {
        int resultat = 0;
        // To do : calculer le score obtenu à la figure "index" et retourner le résultat
        return resultat;

    }
}
