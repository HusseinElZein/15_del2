package Spil;

public class Spiller {

    private static int penge1 = 1000, penge2 = 1000;
    String name;

    public Spiller(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

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
