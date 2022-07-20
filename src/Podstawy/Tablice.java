package Podstawy;

public class Tablice {

    public static void main(String[] args) {

        String[] imiona = new String[3];
        imiona[0] = "Grzegorz";
        imiona[1] = "Agata";
        imiona[2] = "Jasio";
//
//        System.out.println(imiona[0]);

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
//        System.out.println(lottoNumbers[0]);
//        System.out.println(lottoNumbers[3]);
//
//        System.out.println(lottoNumbers.length);

        for (int i=0; i<imiona.length; i++){
            System.out.println(imiona[i]);
        }

        for (int i=0; i<lottoNumbers.length; i++){
            System.out.println(lottoNumbers[i]);
        }
    }
}
