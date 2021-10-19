package Test;

import java.util.Scanner;

public class AlleKlasser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int penge = 1000;
        int terningSum = 0;

        System.out.print("Tryk enter for at starte spillet:");
        String enter = sc.nextLine();

        while(penge<3000){

            System.out.print("Kast med terning: ");
            String enter1 = sc.nextLine();


            int terning = (int) (Math.random()* 11+2);
            System.out.println("Du har slået " + terning);

            terningSum += terning;

            if(terningSum > 12) {
                terning = terningSum - 12;
                terningSum = terningSum - 12;
            }

            System.out.println("Du har ramt felt " + terningSum + "\n");

                switch (terning){

                    case 1:
                        System.out.println( "Tillykke du får ingen penge, men du har stadig " + penge + " kr.");
                        break;
                    case 2:
                        penge = penge + 250;
                        System.out.println("Du har ramt Trumps Tower, velkommen til New York. Trump giver dig 250 kr, fordi han er nærig." +
                                " Du har nu i alt " + penge + " kr. ");
                        break;
                    case 3:
                        penge = penge - 100;
                        System.out.println("Du faldt ned i en crater. Betal 100 kr for at komme op igen. " +
                                "Du har nu i alt " + penge + " kr. ");
                        break;
                    case 4:
                        penge = penge + 100;
                        System.out.println("Du er ankommet til Palace Gates. Du vinder 100 kr i pokerspil, du har nu i alt " + penge + " kr.");
                        break;
                    case 5:
                        penge = penge - 20;
                        System.out.println("Det er meget koldt i Cold Dessert, du fryser og køber en varm kakao for 20 kr. Du har nu i alt " + penge + " kr.");
                        break;
                    case 6:
                        penge = penge + 180;
                        System.out.println("Walled City er den gavmilde by hvor du får 180 kr, du har nu i alt " + penge + " kr.");
                        break;
                    case 7:
                        penge = penge + 0;
                        System.out.println("Velkommen til klosteret. Tillykke du får ingen penge, men du har stadig " + penge + " kr.");
                        break;
                    case 8:
                        penge = penge - 70;
                        System.out.println("Du går ind en en sort grotte, og falder over en sten. Du taber derfor 70 kr. Men du har nu i alt " + penge + " penge");
                        break;
                    case 9:
                        penge = penge + 60;
                        System.out.println("Du har " + penge + " penge");
                        break;
                    case 10:
                        penge = penge - 80;
                        System.out.println("Du har " + penge + " penge");
                        break;
                    case 11:
                        penge = penge - 50;
                        System.out.println("Du har " + penge + " penge");
                        break;
                    case 12:
                        penge = penge + 650;
                        System.out.println("Du har " + penge + " penge");
                        break;
                    }
        }

        System.out.println("Tillykke Spiller x!!! Du har vundet spillet. ");

    }

}
