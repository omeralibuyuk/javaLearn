package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // task girilen ad ve soyadin ilk harflerini büyük digerlerini kucuk yapan method create edin

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen adinizi girin: ");
        String ad = sc.next();

        System.out.println(" lütfen soyadinizi girin: ");
        String soyad = sc.next();

        isimSoyisimHarfKontrol(ad, soyad);


    } // main sonu

    private static void isimSoyisimHarfKontrol(String ad, String soyad) {
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println("ad  soyad = " + ad + " " + soyad);

    }
}