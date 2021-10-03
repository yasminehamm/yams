class Dice{
    private int nbr_face;
    public int value;
    public int roll;

    public Dice(int nbr_face)//constructeur
    {
        this.nbr_face=nbr_face;// this c'est pour différencier entre le private et la nbr dans le constructeur donc this c pour le private
        roll();
        //value=1;
    }

    public Dice()//par def
    {
        this.nbr_face=3;
        roll();
    }

    public void roll()
    {
        value = (int)(Math.random()*nbr_face)+1;
    }

    public void printDice()
    {
        System.out.println(value);
    }

    public int getDiceType()
    {
        return this.nbr_face;
    }

}