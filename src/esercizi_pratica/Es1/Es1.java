package esercizi_pratica.Es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola per vedere se il numero di caratteri e pari o no");

        String s=scanner.nextLine();

//        System.out.println((stringaPariDispari(s))); monoriga al if else di sotto

        if (stringaPariDispari(s)){
            System.out.println("la stringa ha un numero di caratteri pari");
        } else {
            System.out.println("la stringa ha un numero di caratteri dispari");
        }

        System.out.println("inserisci un anno per vedere se e bisestile o no");
        int anno= scanner.nextInt();
        if (annoBisestile(anno)){
            System.out.println("anno bisestile");
        } else {
            System.out.println("anno non bisestile");
        }
    }

    public static boolean stringaPariDispari(String s){
        return s.length() % 2 == 0;
    }


    public static boolean annoBisestile(int anno){
        if ((anno %4 ==0 && anno % 100 != 0) || (anno%100==0 && anno%400==0)) {
            return true;

//        } else if(anno %400 ==0) {
//            return true;
        } else  {return false;}

    }
}
