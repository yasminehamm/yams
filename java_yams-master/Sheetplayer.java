
import java.util.Scanner;

class SheetPlayer {

    private int[] score = new int[7];

    public SheetPlayer(){
        for (int i=0; i<=6;i++)
        {
            score[i]= 0;
        }
    }

    public void printScore(){
        System.out.println("----------------------------");
        System.out.println("Player : Player 1 round : 1 ");
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
    
    public String askFigure(Scanner sc){
        System.out.println(" Indicates the figure you want to roll (abcdef) : ");
        String choice = sc.nextLine();
        return choice;
    }

    //c'est de la merde ça!!!!! 
    public void updateScoring(String choice, YamsDice askDice ){
        if (choice == "a"){
            for (int i=0;i<5;i++){
                if ( askDice.dice5[i].roll== 1){
                    score[1]+=1;
                }
            }
        }
    }
}
