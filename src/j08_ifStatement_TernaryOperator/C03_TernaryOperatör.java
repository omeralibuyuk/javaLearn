package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperatör {
    public static void main(String[] args) {

        // task girilen bir tam sayinin tek ya da cift oldugunu tanimlayan bir code create ediniz.


        Scanner sc = new Scanner(System.in);

        System.out.println("bir tam sayi giriniz: ");
        int agaSayisi=sc.nextInt();

        System.out.println(" ***  if-else  *** ");

        if (agaSayisi % 2 == 0) {
            System.out.println("sayi CIFT");
        } else System.out.println("sayi TEK");


        System.out.println(" ***  ternary  *** ");


        // task girilen bir tam sayinin negatif oldugunu kontrol edin.

        System.out.println("  ***  TASK02  ***  ");
        System.out.println( agaSayisi< 0 ? "agam sayi NEGATIF" : "agam sayi negatif degil" );















































    }
}
