package Podstawy;

public class PracaDomowa3 {

    public static void main(String[] args) {
//
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }

            int[] lottoNumbers = new int[] {1, 3, 5, 7, 0};
//
            for (int i = 0; i<(lottoNumbers.length/2); i++) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[lottoNumbers.length-1-i];
                lottoNumbers[lottoNumbers.length-i-1] = temp;
                System.out.println("Iteracja nr: " + i);
            }

            for (int i=0; i < lottoNumbers.length; i++){
                System.out.println(lottoNumbers[i]);
            }
        }
    }

