package esercizi_pratica.es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero per il conto alla rovescia");
        int numero = scanner.nextInt();

        for (int i = numero; i>=0 ; i--) {
            System.out.println(i);

        }
    }
}
