package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperatör {
    public static void main(String[] args) {

        /* task kullanicidan akacagi ürün miktarini ve ürünün birim fiyatini alin. eger urun miktari 100 den fazla ise %33
        indirim yapip ödemesi gereken toplam miktari pront eden code ecreate edin.

         */

        Scanner sc = new Scanner (System.in);

        System.out.println("lütfen ürün miktari girin: ");
        int ürünMiktari = sc.nextInt();

        System.out.println("lütfen ürün fiyati girin: ");
        int ürünFiyati = sc.nextInt();

        double fatura = ürünMiktari > 100 ? (ürünMiktari*ürünFiyati*0.67): ürünMiktari*ürünFiyati;
        System.out.println("fatura = " + fatura);



















































    }
}
