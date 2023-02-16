package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();



        //TODO implementace domácího úkolu

//      //CAST 1. nakresli prasátko
//        zofka.setLocation(400,50);
//        nakresliPrasatko(zofka);

        //CAST 2. nakresli osmihran + nakresli kolecko + nakresli sluníčko
//        zofka.setLocation(100,250);
//        nakresliOsmihran(zofka);
//
//        zofka.setLocation(400,230);
//        nakresliKolecko(zofka);
//
//        zofka.setLocation(700,220) ;
//        nakresliSlunicko(zofka);

//
//        //CAST 3. KOMPLET OBRAZEK
//        // informace ohledně velikosti plátna, počtu domečků
        int sirkaPlatna = 900; // kolik pixelů je široké plátno
        int domeckuHorniRada = 5; // kolik domečků do horní řady
        int mezeraMeziDomecky = 100;


        int posunDomecku = sirkaPlatna/domeckuHorniRada; // o kolik pixelů posunuju domečky
        int sirkaDomecku = ((sirkaPlatna / domeckuHorniRada) - mezeraMeziDomecky); // zaroven i vyska prasatka
        int vyskaDomecku = sirkaDomecku + 10; // zároven i délka prasátka

        //nakresli prasátko
        zofka.penDown();
        zofka.setLocation((sirkaPlatna/2)+20,350);
        nakresliPrasatko(zofka, vyskaDomecku , sirkaDomecku);
        zofka.turnLeft(45);

        //nakresli spodní řadu domečků
        zofka.setLocation(180,425);
        postavDomecek(zofka, vyskaDomecku, sirkaDomecku);

        zofka.setLocation(900,425);
        postavDomecek(zofka, vyskaDomecku, sirkaDomecku);

        // nakresli horní řadu domečků
        for (int j = 0; j < 5; j++) {
            zofka.setLocation((sirkaPlatna - (j*posunDomecku)), 250);
            postavDomecek(zofka, vyskaDomecku, sirkaDomecku);
        }

// nakresli sluníčko
        zofka.setLocation(200,50);
        nakresliSlunicko(zofka);

    }

    private static void postavDomecek(Turtle zofka, int vyskaDomecku, int sirkaDomecku) {
        for (int i = 0; i < 2; i++) {
            zofka.move(vyskaDomecku);
            zofka.turnLeft(90);
            zofka.move(sirkaDomecku);
            zofka.turnLeft(90);
        }

        zofka.move(vyskaDomecku);
        zofka.turnLeft(90);
        zofka.turnRight(45);
        zofka.move(sirkaDomecku/1.4);
        zofka.turnLeft(90);
        zofka.move(sirkaDomecku/1.4);
        zofka.turnRight(135);
    }

    private static void nakresliSlunicko(Turtle zofka) {
        zofka.penDown();
        for (int k = 0; k < 12; k++) {
//kolečko výseč mezi paprsky
            for (int p = 0; p < 3; p++) {
                zofka.move(3);
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

    private static void nakresliPrasatko(Turtle zofka, int vyskaDomecku, int sirkaDomecku) {
        zofka.turnRight(180);

        // tělo prasátka
        for (int i = 0; i < 2; i++) {
            zofka.move(sirkaDomecku);
            zofka.turnLeft(90);
            zofka.move(vyskaDomecku);
            zofka.turnLeft(90);
        }

        // hlava prasátka / střecha domečku
        zofka.turnRight(45);
        zofka.move(sirkaDomecku/1.4);
        zofka.turnLeft(90);
        zofka.move(sirkaDomecku/1.4);

        // nohy prasátka
        nohyPrasatka(zofka, vyskaDomecku);
    }

    private static void nohyPrasatka(Turtle zofka, int vyskaDomecku) {
        nozicky(zofka);
        zofka.turnRight(30);
        zofka.move(vyskaDomecku);
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
