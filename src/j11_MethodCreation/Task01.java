package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task girilen iki sayinin esitligini kontrol eden method create ediniz..

        Scanner sc = new Scanner(System.in);
        System.out.println(" 1. sayiyi giriniz:  ");
        int sayi1 = sc.nextInt();

        System.out.println(" 2. sayiyi giriniz: ");
        int sayi2 = sc.nextInt();

        esitKontrol(sayi1, sayi2);
        esitKontrol(3,5);
        esitKontrol(33,33);
        esitKontrol(21,33);
        esitKontrol(sayi1, sayi2);
        esitKontrol(sayi1, sayi2);


    } //main method

    private static boolean esitKontrol(int sayi1, int sayi2) {
        boolean esitMi = false;
        if (sayi1 == sayi2) {
            esitMi = true;
        } else esitMi = false;

        return esitMi;
    }







}
