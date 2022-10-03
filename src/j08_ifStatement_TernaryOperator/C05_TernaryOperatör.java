package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperatör {
    public static void main(String[] args) {

        //task girilen bir tamsayi ciftse yarisini degilse
        // girilen sayi tek oldugu icin yarisi tamsayi degildir print eden bir code create edin.

        Scanner sc = new Scanner(System.in);

        System.out.println("bir tam sayi girin: ");
        int sayi = sc.nextInt();

        System.out.println(sayi % 2 == 0 ? sayi / 2 : "girilen sayi tek oldugu ucun yarisi tamsayi degildir");
        //  System.out.println("girdiginiz sayi bir cift sayidir");


    }
}
