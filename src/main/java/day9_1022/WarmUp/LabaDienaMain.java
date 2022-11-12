package day9_1022.WarmUp;

public class LabaDienaMain {
    public static void main(String[] args) {

        //Iteracija iki 100
        // jei skaicius dalinasi is 3 - laba
        // jei skaicius dalinasi is 7 - diena
        // jei skaicius dalinasi 3 ir 7 - laba diena

        int i = 0;
        for ( i=1; i<=100 ; i++){
//jei skaicius dalinasi is 7 be liekanos <IR> jei skaicius dalinasi is 3 be liekanos
            if(  i%3 == 0 & i% 7 == 0 ) {
                System.out.println("Laba diena");
            } else if(i % 7 == 0 ){
                System.out.println("Diena");
            } else if (i % 3 == 0){
                System.out.println("Laba");
            } else{
                System.out.println(i);
            }


        }

    }



}
