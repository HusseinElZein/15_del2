package Spil;

public class Konto {
    private static int penge1 = 1000, penge2 = 1000;

    public static int getPenge1(){
        return penge1;
    }

    public int getPenge2(){
        return penge2;
    }

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
