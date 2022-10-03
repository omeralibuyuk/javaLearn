package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperatör {
    public static void main(String[] args) {

        /* task girilen bir pozitif tamsayi 4 basamakli ise "4 basamakli" prin eden 4 basamakli degilse cift olup
        olmadigini kontrol edip cidt ise "4 basamakli olmayan cift sayi yazdirin.
        cift sayi degilse "4 basamakli olmayan tek sayi yazdirin.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("bir sayi girin: ");
        int sayi = sc.nextInt();

        System.out.println((sayi > 999 && sayi <10000 )? "4 Basamakli" : sayi % 2 == 0 ? "4 basamakli olmayan cift sayi" : "4 basamakli olmayan tek sayi");











































    }
}
