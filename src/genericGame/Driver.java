package genericGame;

import static java.lang.System.out;

public class Driver {

    public static void main(String[] args) {
        Player p = new Player(0, 0, 0);
        p.move(1, 1);
        out.println(p);
    }
}
