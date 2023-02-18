package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        //TODO implementace domácího úkolu

        // informace ohledně velikosti plátna, počtu domečků
        int sirkaPlatna = 900; // kolik pixelů je široké plátno

        int domeckuHorniRada = 5; // kolik domečků do horní řady
        int mezeraMeziDomecky = 100; // kolik je mezera mezi domečky
        int polovicniMezera = mezeraMeziDomecky / 2;
        int otockaPismenoPaR = 2;   // o kolik pixelů se posunu než zatočím
        int odskokPismena = sirkaPlatna/5;

        int posunDomecku = sirkaPlatna/domeckuHorniRada; // o kolik pixelů posunuju domečky
        int sirkaDomecku = 60; // zaroven i vyska prasatka
        int polovinaSirkyDomecku = sirkaDomecku / 2;
        int vyskaDomecku = sirkaDomecku + 10; // zároven i délka prasátka

        int delkaE = sirkaDomecku/3;

        int osaYProPismena = 450;
        int osaYProPrasatko = 330;
        int osaYProHorniDomecky = 180;
        int osaYProSLunicko = 40;

        int osaXProPismena = mezeraMeziDomecky;

//      //CAST 1. nakresli prasátko
//      zofka.setLocation(400,50);
//      nakresliPrasatko(zofka, sirkaDomecku,vyskaDomecku);


//      //CAST 2. nakresli osmihran + nakresli kolecko + nakresli sluníčko
//      zofka.setLocation(100,250);
//      nakresliOsmihran(zofka);
//
//      zofka.setLocation(400,230);
//      nakresliKolecko(zofka);
//
//      zofka.setLocation(700,220) ;
//      nakresliSlunicko(zofka);



        //CAST 3. KOMPLET OBRAZEK

        //nakresli prasátko
        zofka.penDown();
        zofka.setLocation((sirkaPlatna / 2 -20),osaYProPrasatko-vyskaDomecku);
        nakresliPrasatko(zofka, sirkaDomecku, vyskaDomecku);
        zofka.turnLeft(45);


        //nakresli spodní řadu domečků
        zofka.setLocation(sirkaPlatna - polovicniMezera, osaYProPrasatko);
        postavDomecek(zofka, vyskaDomecku, sirkaDomecku);

        zofka.setLocation(sirkaPlatna - polovicniMezera - (4*posunDomecku),osaYProPrasatko);
        postavDomecek(zofka, vyskaDomecku, sirkaDomecku);

        // nakresli horní řadu domečků
        for (int j = 0; j < 5; j++) {
            zofka.setLocation((sirkaPlatna - polovicniMezera - (j*posunDomecku)), osaYProHorniDomecky);
            postavDomecek(zofka, vyskaDomecku, sirkaDomecku);
        }

        // nakresli sluníčko
        zofka.setLocation(200,osaYProSLunicko);
        nakresliSlunicko(zofka);

        //Napis jméno PETRA
        zofka.setLocation(osaXProPismena,osaYProPismena);

        //napiš P
        napisPismenoP(zofka, vyskaDomecku, otockaPismenoPaR);
        zofka.setLocation(osaXProPismena+odskokPismena,osaYProPismena);

        //napiš E
        napisPismenoE(zofka, vyskaDomecku, delkaE, osaXProPismena, odskokPismena, osaYProPismena);
        zofka.setLocation(osaXProPismena+ 2*odskokPismena,osaYProPismena);

        //napiš T
        napisPismenoT(zofka, vyskaDomecku, delkaE);
        zofka.setLocation(osaXProPismena+ 3*odskokPismena,osaYProPismena);

        //napiš R
        napisPismenoR(zofka, vyskaDomecku, otockaPismenoPaR, polovinaSirkyDomecku);
        zofka.setLocation(osaXProPismena+ 4*odskokPismena,osaYProPismena);

        // napiš A
        napisPismenoA(zofka, vyskaDomecku, delkaE, osaXProPismena, odskokPismena, osaYProPismena);
        zofka.setLocation(osaXProPismena+ 5*odskokPismena,osaYProPismena);
    }

    private static void napisPismenoA(Turtle zofka, int vyskaDomecku, int delkaE, int osaXproPismena, int odskokPismena, int osaYproPismena) {
        zofka.move(vyskaDomecku);
        zofka.turnRight(90);
        zofka.move(delkaE);
        zofka.turnRight(90);
        zofka.move(vyskaDomecku);
        zofka.setLocation(osaXproPismena+ 4* odskokPismena, osaYproPismena - delkaE);
        zofka.turnLeft(90);
        zofka.move(delkaE);
        zofka.turnLeft(90);
    }

    private static void napisPismenoR(Turtle zofka, int vyskaDomecku, int otockaPismenoPaR, int polovinaSirkyDomecku) {
        zofka.move(vyskaDomecku);
        zofka.turnRight(90);
        for (int i = 0; i < 30; i++) {
            zofka.move(otockaPismenoPaR);
            zofka.turnRight(6);
        }
        zofka.turnLeft(125);
        zofka.move(polovinaSirkyDomecku+7);
        zofka.turnLeft(145);
    }

    private static void napisPismenoT(Turtle zofka, int vyskaDomecku, int delkaE) {
        zofka.move(vyskaDomecku);
        zofka.turnLeft(90);
        zofka.move(delkaE /1.5);
        zofka.turnRight(180);
        zofka.move(delkaE *1.3);
        zofka.turnLeft(90);
    }

    private static void napisPismenoE(Turtle zofka, int vyskaDomecku, int delkaE, int osaXProPismena, int odskokPismena, int osaYProPismena) {
        zofka.move(vyskaDomecku);
        zofka.turnRight(90);
        zofka.move(delkaE);

        zofka.setLocation(osaXProPismena+odskokPismena, osaYProPismena);
        zofka.move(delkaE);

        zofka.setLocation(osaXProPismena+odskokPismena,osaYProPismena - vyskaDomecku/2);
        zofka.move(delkaE);
        zofka.turnLeft(90);
    }

    private static void napisPismenoP(Turtle zofka, int vyskaDomecku, int otockaPismenoPaR) {
        zofka.move(vyskaDomecku);
        zofka.turnRight(90);
        for (int i = 0; i < 30; i++) {
            zofka.move(otockaPismenoPaR);
            zofka.turnRight(6);
        }
        zofka.turnRight(90);

    }


    private static void postavDomecek(Turtle zofka, int vyskaDomecku, int sirkaDomecku) {
        // domeček bez střechy
        for (int i = 0; i < 2; i++) {
            zofka.move(vyskaDomecku);
            zofka.turnLeft(90);
            zofka.move(sirkaDomecku);
            zofka.turnLeft(90);
        }

        // střecha
        zofka.move(vyskaDomecku);
        zofka.turnLeft(90);
        zofka.turnRight(45);
        zofka.move(sirkaDomecku/1.4);
        zofka.turnLeft(90);
        zofka.move(sirkaDomecku/1.4);
        zofka.turnRight(135);
    }

    private static void nakresliSlunicko(Turtle zofka) {
        for (int k = 0; k < 12; k++) {
            //kolečko výseč mezi dvanácti paprsky
            for (int p = 0; p < 3; p++) {
                zofka.move(3);
                zofka.turnRight(10);
            }
            //jeden paprsek
            zofka.turnLeft(90);
            zofka.move(10);
            zofka.turnLeft(180);
            zofka.move(10);
            zofka.turnLeft(90);
        }
    }


    private static void nakresliKolecko(Turtle zofka) {
        for (int i = 0; i < 46; i++) {
            zofka.move(10);
            zofka.turnRight(8);
        }
    }

    private static void nakresliOsmihran(Turtle zofka) {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }

    private static void nakresliPrasatko(Turtle zofka, int sirkaDomecku, int vyskaDomecku) {
        zofka.turnRight(180);

        // tělo prasátka
        for (int i = 0; i < 2; i++) {
            zofka.move(sirkaDomecku);
            zofka.turnLeft(90);
            zofka.move(vyskaDomecku);
            zofka.turnLeft(90);
        }

        // hlava prasátka
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
