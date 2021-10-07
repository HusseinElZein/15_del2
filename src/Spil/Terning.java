package Spil;

public class Terning {

    private int terning, terningSum;

    public void Terning() {

        int terningSum = 0;

        int terning = (int) (Math.random() * 11 + 2);

        terningSum += terning;

        if (terningSum > 12) {
            terning = terningSum - 12;
            terningSum = terningSum - 12;
        }
    }
}