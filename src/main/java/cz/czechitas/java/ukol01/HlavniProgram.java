package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu

        //CAST 1 - nakresli prasátko
        nakresliPrasatko(zofka);

    }

    private static void nakresliPrasatko(Turtle zofka) {
        // tělo prasátka
        zofka.turnRight(180);
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }

        // hlava prasátka
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);

        // nohy prasátka
        nozicky(zofka);
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(30);
        nozicky(zofka);
    }

    private static void nozicky(Turtle zofka) {
        zofka.move(25);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(75);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
