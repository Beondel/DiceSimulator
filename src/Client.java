/**
 * Created by benjaminmacmillan1 on 1/15/17.
 */
public class Client {
    public static void main(String[] args) {
        Dice firstDice = new Dice(6);
        Dice secondDice = new Dice(6);

        for (;;) {
            System.out.println("roll is: " + rollDice(firstDice, secondDice));
        }
    }

    public static int rollDice(Dice one, Dice two) {
        return one.roll() + two.roll();
    }
}
