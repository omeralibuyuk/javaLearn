package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperatör {
    public static void main(String[] args) {

     /* kullanicadan bir sayi alin.
     sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol edeniz.
     10 dan kucuk ise ekrana rakam yazdiriniz degilse pozitif sayi yazdiriniz.
     sayi 0 dan kucukse ekrana negatif sayi yazdirin
      */

        Scanner sc = new Scanner(System.in);

        System.out.println("lütfen bir tam sayi girin: ");
        int sayi = sc.nextInt();

        System.out.println(sayi >= 0 ? (sayi < 10 ? "Rakam" : "Pozitif Sayi"): "Negatif Sayi");





































    }
}
