package headfirst;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    void start() {
        // create the 3 player instances
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        // hold the guesses
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        // hold the results of guesses
        boolean isp1Right = false;
        boolean isp2Right = false;
        boolean isp3Right = false;
        // hold the target
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("target is " + targetNumber);
        // enter the loop
        while(true){
            // make the guesses
            p1.guess();
            p2.guess();
            p3.guess();

            // assign guesses
            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            if(targetNumber == guessp1)
                isp1Right = true;

            if(targetNumber == guessp2)
                isp2Right = true;

            if(targetNumber == guessp3)
                isp3Right = true;



            // break endless loop
            if(isp1Right || isp2Right || isp3Right){
                System.out.println("we have a winner");
                System.out.println("p1 " + guessp1);
                System.out.println("p2 " + guessp2);
                System.out.println("p3 " + guessp3);
                break;
            }
        }
    }
}
