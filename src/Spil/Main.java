package Spil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast dit navn: ");
        String navn1 = sc.nextLine();

        Spiller sp1 = new Spiller();

        System.out.println(sp1.setName(navn1));

    }

}
