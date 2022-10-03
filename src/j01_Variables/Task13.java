package j01_Variables;

import java.util.Scanner;
import java.util.SortedMap;

public class Task13 {
    public static void main(String[] args) {
        // bir byte olusturun konsola kg cinsinden bir agirlik girin, ardindan hedef kilonuzu girip
        // aradaki kilo farkini bul

        Scanner sc = new Scanner(System.in);

        System.out.print(" lütfen kilonuzu girin: ");

        byte kilo;

        byte hedefKilo;

        kilo = sc.nextByte();

        System.out.print(" lütfen hedef kilonuzu girin: ");

        hedefKilo = sc.nextByte();

        System.out.print(" zayiflamaniz gereken kilo: " + (kilo - hedefKilo) + "kg");
    }
}
