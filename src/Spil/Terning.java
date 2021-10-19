package Spil;

public class Terning {

    // Vi initierer en privat terning, fordi terning kun skal bruges i Terning-klassen.
    private int terning;
    // Vi initierer felter pr person og gør dem static så der kun er to. Her er terningsum felter.
    private static int terningSum1,terningSum2;

    //Her får vi terningekastet retur i en string.
    public String toString() {
        return String.valueOf(terning);
    }

    //Her bliver der dannet en terning1 hvor der rykkes på både felt og terning samt returneres en string.
    public String Terning1() {
        this.terning = (int) (Math.random()*11+2);
        terningSum1+=terning;

        if(terningSum1 > 12) {
            terningSum1 = terningSum1 - 12;
        }

        return "har slået "+ toString() + " \nDu står på felt "+ terningSum1;
    }

    //Getter terningsum1
    public static int getTerningSum1() {
        return terningSum1;
    }

    public String Terning2() {
        this.terning = (int) (Math.random()*11+2);
        terningSum2+=terning;

        if(terningSum2 > 12) {
            terningSum2 = terningSum2 - 12;
        }

        return "har slået "+ toString() + " \nDu står på felt "+ terningSum2;
    }

    public static int getTerningSum2() {
        return terningSum2;
    }

    public int getTerning() {
        return terning;
    }
}

