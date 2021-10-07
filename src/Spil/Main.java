package Spil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Velkommen til feltspillet!\n" +
                "Tryk enter for at starte spillet: ");

        String enter = sc.nextLine();

        System.out.println();

        System.out.print("Spiller 1, indtast dit navn: ");
        String navn1 = sc.nextLine();

        System.out.print("Spiller 2, indtast dit navn: ");
        String navn2 = sc.nextLine();

        System.out.println();

        Spiller sp1 = new Spiller(navn1);
        Spiller sp2 = new Spiller(navn2);

        System.out.println("Velkommen " + sp1.getName() + " og " + sp2.getName());

    }

}
