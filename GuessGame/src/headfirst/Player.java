package headfirst;

public class Player {

    int number;

    void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I am guessing number " + number);
    }
}
