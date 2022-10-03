package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // girilen bir yilin artik yil olmasini kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir yil giriniz :");
        int yil = sc.nextInt();
        if ((yil%4==0) && (yil %100!=0)  ||   (yil%400==0)){

            System.out.println("girdiginiz yil artik yil :-)");
        } else {
            System.out.println("girdiginiz yil artik yil degildir :-( ");
        }


























    }
}
