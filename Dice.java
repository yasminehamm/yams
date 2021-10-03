class Dice {
    private int nbr_faces;
    private int value;

    public Dice(int faces)// constructeur
    {
        this.nbr_faces = faces;// this c'est pour différencier entre le private et la nbr dans le constructeur
                                 // donc this c pour le private
        roll();
        // value=1;
    }

    public Dice()// par def
    {
        this.nbr_faces = 6;
        roll();
    }

    public void roll() {
        value = (int) (Math.random() * nbr_faces) + 1;
    }

    public void printDice() {
        System.out.print(" " + value);
    }

    public int getDiceType() {
        return this.nbr_faces;
    }

    public int getValue() {
        return this.value;
    }
}