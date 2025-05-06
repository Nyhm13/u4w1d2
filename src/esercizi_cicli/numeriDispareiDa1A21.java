package esercizi_cicli;

public class numeriDispareiDa1A21 {
    public static void main(String[] args) {

//        for (int i=3;i<=21; i++){
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }


      // alternativa al ciclo precedente senza if in quanto il ciclo incrementa di 2
//        for (int i =3 ; i<=21; i=i+2){
//            System.out.println(i);
//        }


//        int i=3;
//        while(i<=21){
//            System.out.println(i);
//            i=i+2;
//        }



       // alternativa al ciclo while con do while
        int i=3;
        do {
            System.out.println(i);
            i=i+2;

        } while (i<=21);

    }
}
