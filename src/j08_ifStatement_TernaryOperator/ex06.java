package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        /*
        task kullanicin cinsiyeti kadin ise 60 yasindan büyük ve prim gunu 6000 den fazla ise emekliligini kullanicinin
        cinsiyeti erkek ise 65 yasindan buyuk ve prim gunu 7000 den fazla ise emekliligini kontrol edip kalan yil ve prim
        gununu print eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("cinsiyetiniz \n kadin icin -> K\n erkek icin n-> E\n giriniz: ");
        char cinsiyet = sc.next().charAt(0);



        if (cinsiyet == 'K'){
        System.out.println("yasinizi girin: ");
        int yas = sc.nextInt();
        if (yas >60 ) {
            System.out.println("prim gününüzü giriniz :");
            int primGunu = sc.nextInt();

            if (primGunu > 6000) {
                System.out.println("tebrikler ninem emekli oldun");
            } else System.out.println("emekliliginiz icin: " + (6000 - primGunu) + " gun yatirmaniz lazim");

        }else System.out.println("emekliliginize daha : " + (60 - yas)+ "yil daha var");

            }
    }































    }
