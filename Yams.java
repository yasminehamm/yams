
/** 
 * @file Yams.java
 * @author WEBER rodolphe <rodolphe.weber@univ-orleans.fr> 
 * @version 1.0 
 * @date 24/07/2021
 * @mainpage
 * @section LICENSE 
 * 
 * This program is free software; you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as 
 * published by the Free Software Foundation; either version 2 of 
 * the License, or (at your option) any later version. 
 * 
 * @section DESCRIPTION 
 * 
 * This java file represents a java lab for the 4th year students of Polytech Orleans.  
 */
import java.util.Scanner;

public class Yams {

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        /*
         * Dice d = new Dice(); for(int i = 0; i < 10; i++) d.roll();
         * System.out.println("getValue(): " + d.getDiceType());
         * 
         * YamsDice yd = new YamsDice(); Scanner sc = new Scanner(System.in);
         * //System.out.println(yd.askDice(sc)); yd.printYams();
         * yd.rollYams(yd.askDice(sc)); yd.printYams();
         */

        YamsDice myDice5 = new YamsDice();
        SheetPlayer player1 = new SheetPlayer();
        Scanner sc = new Scanner(System.in);
        // int figureIndex;

        for (int idx = 0; idx < 13; idx++) {
            clearScreen();
            player1.printScore();
            myDice5.rollYams("12345");// 1st roll
            myDice5.printYams();
            myDice5.rollYams(myDice5.askDice(sc));// 2nd roll
            clearScreen();
            player1.printScore();
            myDice5.printYams();
            // figureIndex=player1.askFigure(sc);
            myDice5.rollYams(myDice5.askDice(sc));// 3rd roll
            // player1.updateScoring(figureIndex , myDice5.getScore(figureIndex));//
            clearScreen();
            player1.printScore();
            myDice5.printYams();
            System.out.print("press return");
            sc.nextLine(); // wait
        }
        sc.close();
        // System.out.println("Player1, your final score : "+ player1.totalScore());

    }
}
