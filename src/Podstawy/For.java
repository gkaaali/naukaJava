package Podstawy;

public class For {

    public static void main(String[] args) {

//        System.out.println(0);
//        System.out.println(2);
//        System.out.println(4);
//
//        int number1 = 60;

        for (int i = 0; i < 100; i = i+10) {      //wartość początkowa; warunek do którego pętla ma sie wykonać; to jak zmienia się i
           if(i < 50){
               System.out.println(i);
           }
        }

        for (int sth = 0; sth < 5; sth++){
            System.out.println("Będę odrabiał prace domowe");
        }
    }
}
