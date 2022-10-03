package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        task girilen yasin 18 den büyük oldugunui kontrol eden code create ediniz
         */

        Scanner sc= new Scanner (System.in);
        System.out.println("yasinizi girin");
        int yas=sc.nextInt();
     //   if (yas>18) {
     //       System.out.println("yasiniz 18'den büyük");
     //   }

        /* task girilen yasin 18 den büyük oldugunu kontrol eden bir create yapin.
        18 den kucuk ise ehliyet alamazsin print edin.
         */
        if (yas>=18) {
            System.out.println("yasiniz 18 den kucuk degil");
        } else { System.out.println("ehliyet alamazsiniz");
        }





    }
}
