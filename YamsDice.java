import java.util.Scanner;

class YamsDice {
    
    public Dice[] dice5 = new Dice[5];

    public YamsDice(){
        for (int i=0; i<=4;i++)
        {
            dice5[i]= new Dice();
        }
    }

    public void printYams(){
        System.out.println("Dice n° 1 2 3 4 5");
        System.out.println("        " + dice5[0].value + " "+ dice5[1].value + " " + dice5[2].value + " " + dice5[3].value + " " + dice5[4].value);
    }

    public String askDice(Scanner sc){
        System.out.println(" Indicates the dices you want to roll (12345) : ");
        String position = sc.nextLine();
        return position;
    }

    public void rollYams(String position){
        for (int i=1; i<=5;i++){
            if(position.contains(String.valueOf(i)) == true)
            dice5[i-1].roll();
        }
    }

    

}
