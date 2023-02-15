package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu

        //CAST 1 - nakresli prasátko
        zofka.setLocation(400,50);
        nakresliPrasatko(zofka);

        //CAST 2. nakresli osmihran + nakresli kolecko + nakresli sluníčko
        zofka.setLocation(100,250);
        nakresliOsmihran(zofka);

        zofka.setLocation(400,230);
        nakresliKolecko(zofka);

        zofka.setLocation(700,220) ;
        nakresliSlunicko(zofka);
    }

    private static void nakresliSlunicko(Turtle zofka) {
        zofka.penDown();
        for (int k = 0; k < 12; k++) {
//kolečko výseč mezi paprsky
            for (int p = 0; p < 3; p++) {
                zofka.move(10);
                zofka.turnRight(10);
            }
//paprsek
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.turnLeft(180);
            zofka.move(15);
            zofka.turnLeft(90);
        }
        zofka.penUp();
    }


    private static void nakresliKolecko(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 46; i++) {
            zofka.move(10);
            zofka.turnRight(8);
        }
        zofka.penUp();
    }

    private static void nakresliOsmihran(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
        zofka.penUp();
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
