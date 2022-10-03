package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        // kullanicadan veri almak icin su 3 adim takip edilir
        // 1. adim Scanner class`tan obj create edilir

  /*      Scanner scan = new Scanner(System.in); // scanner classindan scan isminden degeri System icinden alan bir obj

        // 2. adim kullanicidan istenilen veri icin bildirimde bulunulur -> sout ("...");
        System.out.println("adinizi girin :");

        // 3, adim kullanicinin girdigi veri data typine gore bir variable atanir.

        String isim=scan.nextLine(); // kullanicidan gelen String tipinde isim verisi scan objni nextLine () methidu ile atandi.

        System.out.println("isim = " + isim);

        // Task kullanicinin girdigi degere göre kare alani ve cevresini hesaplayan bir code create ediniz.

   */

        Scanner scanner = new Scanner(System.in); // 1.adim
       // System.out.print("karenin kenarini girin "); // 2.adim
        // int kenar= scanner.nextInt(); // 3 adim

       // System.out.println("alan : " + (kenar*kenar)+ "cevre : "+(kenar*4));


        /*
        kullanicinin gunde ictigi cay ve kullandigi seker degerine gore bir yilda kac kg seker kg kullandigini hesaplayan bir code create ediniz..
        1 seker = 1.7gr

        ornek : Input : cay sayisi : 10 seker ssayisi : 2

                Output : Yilda 12.41 kg seker kullaniyorsunuz

         */

       /* System.out.println("günlük ictiginiz cay sayisini girin :"); //2. adim
        int caySayisi= scanner.nextInt(); // cay icin 3 adim

        System.out.println("seker sayinizi girin: ");
        int seker= scanner.nextInt(); // seker icin 3 adim

        System.out.println("yillik seker tüketiminiz : " + (caySayisi*seker*1.7*365)/1000+"kg"); */

        System.out.println("isminizi girin :");
     //   char ch= scanner.nextLine().charAt(0); // kullanicidan gelen string ifadenin 0. index ilk  alir karakterini
     //   System.out.println("isminizin ilk karakteri : "+ch);

        String isim= scanner.next(); //kullanicinin girdigi ilk ifadeyi ad'e atar
        System.out.println("ad = " + isim);








    }
}