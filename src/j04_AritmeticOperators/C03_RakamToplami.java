package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi giriniz : ");

        int sayi = scan.nextInt();

        int birler = sayi % 10;
        sayi /= 10;
        int onlar = sayi %10;
        int yüzler = sayi / 10;

        int rakamToplami = birler + onlar + yüzler;
        System.out.println("rakamToplami = " + rakamToplami);


    }
}
