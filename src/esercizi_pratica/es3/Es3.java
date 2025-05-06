package esercizi_pratica.es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String s;

        System.out.println("inserisci una stringa per suddividerla in caratteri separati da una virgola: inserisci :q per terminare");
         s=scanner.nextLine();

        while (!s.equals(":q")){
            for (int i = 0; i <s.length() ; i++) {
                System.out.print(s.charAt(i));

                if (i != s.length()-1) {
                    System.out.print(",");
                }


            }
                System.out.println();

                System.out.println("inserisci una stringa per suddividerla in caratteri separati da una virgola: inserisci :q per terminare");
                s=scanner.nextLine();


        }
        System.out.println("Programma terminato.");
    }
}
