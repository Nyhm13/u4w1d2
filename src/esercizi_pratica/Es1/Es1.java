package esercizi_pratica.Es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola per vedere se il numero di caratteri e pari o no");

        String s=scanner.nextLine();

        if (stringaPariDispari(s)){
            System.out.println("la stringa ha un numero di caratteri pari");
        } else {
            System.out.println("la stringa ha un numero di caratteri dispari");
        }

    }

    public static boolean stringaPariDispari(String s){
        return s.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno){
        if (anno %4 ==0 && anno % 100 != 0) {
            return true;

        } else if(anno %400 ==0) {
            return true;
        } else  {return false;}

    }
}
