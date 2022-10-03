package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperatör {
    public static void main(String[] args) {

        // task girilen bir tam sayinin 2 veya daha fazla basamakli oldugunu kontrol eden bir code create et.

        Scanner sc = new Scanner(System.in);

        System.out.println("lütfen bir sayi giriniz: ");

        int sayi = sc.nextInt();
        System.out.println(sayi > 9 ? "sayi iki veya daha fazla basamakli" : "sayi tek basamakli");


    }
}
