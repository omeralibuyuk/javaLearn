package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        /*
        TASK: kullanicinin ehliyetinin varligini kontrol ediniz.
        ehliyeti varsa yil tecrübesi 7 yil ve üstü ise aldigi mesafe 100.000 km ve üzeri ose kontak anahtari
        veriniz aksi durumda tecrübe yili ve mesafe eksiklerini print eden bir code create ediniz
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("ehliyetiniz varsa E yoksa H giriniz : ");

        char ehliyet=sc.next().toUpperCase().charAt(0);
        if (ehliyet== 'E') {
            System.out.println("kac yillik tecrüben var: ");
            int tecrübe = sc.nextInt();
            if (tecrübe >= 7) {
                System.out.println("yaptiginiz km mesafesini giriniz: ");
                int km=sc.nextInt();
                if (km > 100000) {

                }else System.out.println("anahtar icin önce" + (100000 - km) + "yola ihtiyacin var");
                System.out.println("anahtar senindir");

                }else System.out.println("anahtar icin önce " + (7-tecrübe) + " yila ihtiyacin var");


            } else if (ehliyet == 'H') {
                System.out.println("önce ehliyet al");
            }else System.out.println("önce karakter gir");

        }


    }
