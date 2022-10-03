package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /* girilen bir sayinin negatif ve pozitifligini kontrol eden code creat edin.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir: ");
        int sayi = sc.nextInt();

        if (sayi>0) {
            System.out.println("girilen sayi pozitif");
        } else if (sayi<0) {
            System.out.println("girilen sayi negatiftir");
        } else {
            System.out.println("girilen sayi sifir");
        }




    }
}
