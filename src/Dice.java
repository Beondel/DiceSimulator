/**
 * Created by benjaminmacmillan1 on 1/15/17.
 */
import java.util.*;

public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random side = new Random();

        return side.nextInt(this.sides) + 1;
    }
}
