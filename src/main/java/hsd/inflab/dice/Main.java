package hsd.inflab.dice;

public class Main {
    public static void main(String[] args) {
        Shaker shaker = new Shaker();
        //shaker.addDice();

        //MultisidedDice  multidice = new RegularDice();  //example
        while(true) {
            shaker.throwDice();
        }
    }
}
