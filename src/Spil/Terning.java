package Spil;

public class Terning {

    private int terning;
    private static int terningSum1,terningSum2;

    public String Terning1() {
        this.terning = (int) (Math.random()*11+2);
        terningSum1+=terning;

        if(terningSum1 > 12) {
            terningSum1 = terningSum1 - 12;
        }

        return "har slået "+ terning + " \nDu står på felt "+ terningSum1;
    }

    public static int getTerningSum1() {
        return terningSum1;
    }

    public String Terning2() {
        this.terning = (int) (Math.random()*11+2);
        terningSum2+=terning;

        if(terningSum2 > 12) {
            terningSum2 = terningSum2 - 12;
        }

        return "har slået "+ terning + " \nDu står på felt "+ terningSum2;
    }

    public static int getTerningSum2() {
        return terningSum2;
    }

    public int getTerning() {
        return terning;
    }
}

