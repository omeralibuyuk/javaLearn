package j01_Variables;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        ///* TASK02 ->
        // Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle endeksini bulun.
        //         Sonucu tamsayi ve ondalikli sayi olarak yazdirin
        //         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir*/

        Scanner sc = new Scanner(System.in);

        System.out.print(" lütfen boyunuzu cm cinsinden yaziniz: ");
        double boyunuz = sc.nextDouble();

        System.out.print(" lütfen kilonuzu kg cinsinden giriniz: ");
        double kilonuz = sc.nextDouble();

        double vki = kilonuz / ((boyunuz/100) * (boyunuz/100));

        System.out.print(" vücut kitle indeksiniz: " + vki);

























    }
}
