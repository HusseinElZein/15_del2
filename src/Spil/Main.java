package Spil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Der laves en scanner og bibloteket importeres
        Scanner sc = new Scanner(System.in);

        System.out.print("Velkommen til feltspillet!\n" +
                "Tryk enter for at starte spillet: ");
        // Vi får spilleren til at trykke "enter" for at fortsætte spillet
        String enter = sc.nextLine();

        System.out.println();

        System.out.print("Spiller 1, indtast dit navn: ");
        //Det næste input der forekommer er navn1
        String navn1 = sc.nextLine();

        System.out.print("Spiller 2, indtast dit navn: ");
        String navn2 = sc.nextLine();

        System.out.println();

        // Laver to nye spillere, samt to kontoer
        Spiller sp1 = new Spiller();
        Spiller sp2 = new Spiller();
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();

        // Setter navnene
        sp1.setNavn(navn1);
        sp2.setNavn(navn2);

        System.out.println("Velkommen " + sp1.getNavn() + " og " + sp2.getNavn() + "\n");

        // Hvis begge spilleres pengebeholdning er < 3000kr, så skal spillet fortsætte, ved at den næste kaster en terning
        while (konto1.getPenge1() < 3000 && konto2.getPenge2() < 3000) {

            System.out.print(sp1.getNavn() + " Kast med terningerne");

            // Denne boolean nedenfor bestemmer om spilleren får et ekstra kast
            boolean again = true;
            while (again) {
                again = false;

            String enter1 = sc.nextLine();

            // Laves ny terning til spiller1
            Terning kastSpiller1 = new Terning();
            System.out.println("Du " + kastSpiller1.Terning1());

                // Vi har en switch case for de forskellige felter og dette er kun for spiller1.
                //  Indeni hvert case (felt) udregnes der en konsekvens for pengepungen.


                switch (kastSpiller1.getTerningSum1()) {

                    case 1:
                        System.out.println("Tillykke du får ingen penge, men du har stadig " + konto1.getPenge1() + " kr.");
                        break;
                    case 2:
                        konto1.setPenge1(250);
                        System.out.println("Du har ramt Trumps Tower, velkommen til New York. Trump giver dig 250 kr, fordi han er nærig." +
                                " Du har nu i alt " + konto1.getPenge1() + " kr. ");
                        break;
                    case 3:
                        konto1.setPenge1(-100);
                        System.out.println("Du faldt ned i en crater. Du skal betale 100 kr for at komme op igen. " +
                                "Du har nu i alt " + konto1.getPenge1() + " kr. ");
                        break;
                    case 4:
                        konto1.setPenge1(100);
                        System.out.println("Du er ankommet til Palace Gates. Du vinder 100 kr i pokerspil, du har nu i alt " + konto1.getPenge1() + " kr.");
                        break;
                    case 5:
                        konto1.setPenge1(-20);
                        System.out.println("Det er meget koldt i Cold Dessert, du fryser og køber en varm kakao for 20 kr. Du har nu i alt " + konto1.getPenge1() + " kr.");
                        break;
                    case 6:
                        konto1.setPenge1(180);
                        System.out.println("Walled City er den gavmilde by hvor du får 180 kr, du har nu i alt " + konto1.getPenge1() + " kr.");
                        break;
                    case 7:
                        konto1.setPenge1(0);
                        System.out.println("Velkommen til klosteret. Tillykke du får ingen penge, men du har stadig " + konto1.getPenge1() + " kr.");
                        break;
                    case 8:
                        konto1.setPenge1(-70);
                        System.out.println("Du går ind en en sort grotte, og falder over en sten. Du taber derfor 70 kr. Men du har nu i alt " + konto1.getPenge1() + " kr.");
                        break;
                    case 9:
                        konto1.setPenge1(60);
                        System.out.println("Du har leveret en pakke til Pizza Hut, og modtager 60 kroner, du har nu " + konto1.getPenge1() + " kr.");
                        break;
                        // Hvis spilleren lander på felt 10
                    case 10:
                        // Spilleren mister 80kr
                        konto1.setPenge1(-80);
                        System.out.println("Du har mødt en vareulv. Den spiste dine 80 kr. Du har nu " + konto1.getPenge1() + " kr.");
                        // Spilleren får en ekstra tur
                        again = true;
                        System.out.println(sp1.getNavn() + " får en ekstra tur: ");
                        // Break ud af switch
                        break;
                    case 11:
                        konto1.setPenge1(-50);
                        System.out.println("Du har gemt 50 kr i et hul. Du har nu " + konto1.getPenge1() + " kr.");
                        break;
                    case 12:
                        konto1.setPenge1(650);
                        System.out.println("Du har ramt guldminen! Du modtager nu 650 kr. Du har nu " + konto1.getPenge1() + " kr.");
                        break;
                }
            }
            // Hvis spiller1 har 3000 eller derovre, så breakes der ud af while loopet
            System.out.println();
            if (konto1.getPenge1() >= 3000)
                break;

            // Hvis spiller et har 0 i pengebeholdningen, så breakes der ud af while loopet
            if(konto1.getPenge1() ==0){
                 System.out.println(sp1.getNavn() + " du er gået bankerot " );
                break;
            }

            System.out.print(sp2.getNavn() + " Kast med terningerne");

            boolean again1 = true;
            while (again1) {
                again1 = false;

            String enter2 = sc.nextLine();
            Terning kastSpiller2 = new Terning();
            // Der bliver kastet en terning
            System.out.println("Du " + kastSpiller2.Terning2());

                switch (kastSpiller2.getTerningSum2()) {

                    case 1:
                        System.out.println("Tillykke du får ingen penge, men du har stadig " + konto2.getPenge2() + " kr.");
                        break;
                    case 2:
                        konto2.setPenge2(250);
                        System.out.println("Du har ramt Trumps Tower, velkommen til New York. Trump giver dig 250 kr, fordi han er nærig." +
                                " Du har nu i alt " + konto2.getPenge2() + " kr. ");
                        break;
                    case 3:
                        konto2.setPenge2(-100);
                        System.out.println("Du faldt ned i en crater. Betal 100 kr for at komme op igen. " +
                                "Du har nu i alt " + konto2.getPenge2() + " kr. ");
                        break;
                    case 4:
                        konto2.setPenge2(100);
                        System.out.println("Du er ankommet til Palace Gates. Du vinder 100 kr i pokerspil, du har nu i alt " + konto2.getPenge2() + " kr.");
                        break;
                    case 5:
                        konto2.setPenge2(-20);
                        System.out.println("Det er meget koldt i Cold Dessert, du fryser og køber en varm kakao for 20 kr. Du har nu i alt " + konto2.getPenge2() + " kr.");
                        break;
                    case 6:
                        konto2.setPenge2(180);
                        System.out.println("Walled City er den gavmilde by hvor du får 180 kr, du har nu i alt " + konto2.getPenge2() + " kr.");
                        break;
                    case 7:
                        konto2.setPenge2(0);
                        System.out.println("Velkommen til klosteret. Tillykke du får ingen penge, men du har stadig " + konto2.getPenge2() + " kr.");
                        break;
                    case 8:
                        konto2.setPenge2(-70);
                        System.out.println("Du går ind en en sort grotte, og falder over en sten. Du taber derfor 70 kr. Men du har nu i alt " + konto2.getPenge2() + " penge");
                        break;
                    case 9:
                        konto2.setPenge2(60);
                        System.out.println("Du har leveret en pakke til Pizza Hut, og modtager 60 kroner" +
                                " nu har du " + konto2.getPenge2() + " kr.");
                        break;
                    case 10:
                        konto2.setPenge2(-80);
                        System.out.println("Du har mødt en vareulv. Den spiste dine 80 kr. Du har nu " + konto2.getPenge2() + " kr.");
                        again1 = true;
                        System.out.println(sp2.getNavn() + " får en ekstra tur: ");
                        break;
                    case 11:
                        konto2.setPenge2(-50);
                        System.out.println("Du har gemt 50 kr i et hul. Du har nu " + konto2.getPenge2() + " kr.");
                        break;
                    case 12:
                        konto2.setPenge2(650);
                        System.out.println("Du har ramt guldminen! Du modtager nu 650 kr. Du har nu " + konto2.getPenge2() + " kr.");
                        break;
                }

            } // Slut på while loop
                System.out.println();
                if (konto2.getPenge2() >= 3000)
                    break;

                 if(konto2.getPenge2() ==0){
                     System.out.println(sp2.getNavn() + " du er gået bankerot " );
                     break;}
            }

        // Efter der er blevet breaket ud af while loopet, tjekkes der hvilken spiller der har flest penge
        // Hvis spiller1 har højere end spiller2
        if(konto1.getPenge1()> konto2.getPenge2()) {
            // Spiller1 har vundet
            System.out.println("Tillykke " + sp1.getNavn() +  "!!! Du har vundet spillet! ");
        } else {
            // Ellers har spiller2 vundet
            System.out.println("Tillykke " + sp2.getNavn() +  "!!! Du har vundet spillet! ");
        }

    }

}

