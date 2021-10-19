package Spil;

public class Konto {

    // Vi initierer to private pengebeholdninger som er lig med 1000 grundet kundens krav, og de er static da der kun skal være en af dem pr klasse.
    private static int penge1 = 1000, penge2 = 1000;

    // Getter Penge1
    public static int getPenge1(){
        return penge1;
    }

    // Getter Penge2
    public int getPenge2(){
        return penge2;
    }

    // Setter penge1 og hvis penge1<0 så bliver pengebeholdningen=0, eftersom kunden ikke vil have en negativ balance.
    public void setPenge1(int penge1) {
        Konto.penge1 = Konto.penge1 + penge1;

        if(Konto.penge1<0) {

            Konto.penge1 = 0;
        }
    }

    public void setPenge2(int penge2) {

        Konto.penge2 = Konto.penge2 + penge2;

        if(Konto.penge2<0) {

            Konto.penge2 = 0;
        }

    }

}
