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
        Spiller.penge1 = Spiller.penge1 + penge1;
    }

    public void setPenge2(int penge2) {
        Spiller.penge2 = Spiller.penge2 + penge2;
    }

}