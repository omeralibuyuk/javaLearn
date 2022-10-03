package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

      /* byte < short < int < long < float < double
      Auto  widenig casting -> Kucuk data type'lerini buyuk data tyolerina Java otomatik olarak yapar.
       */

boolean basarili=true;

// boolean basari=basarili; -> dogal uyum olmayan variable larda casting yapilamaz CTE
// System.out.println("basari = " + basari); -> true
// System.out.println("basarili = " + basarili); -> true
double d = 17; // double variable a int 17 atandi k->b
System.out.println("d = " + d); //d =17.0 auto widding

        int sayi1=33;
        int sayi2=7;

        System.out.println(sayi1/sayi2); //4

        /*
        Java iki int sayisini birbirine bölündügünde sonucu int verir
        eger bölme isleminde ondalik sonuc cikarsa ondalik kismi siler.
         */

        byte b = 127;
        int i = b;

        System.out.println("i = " + i);
        int num=1453;
        double d1 = 17; //num;
        System.out.println("d1 = " + d1);

        double db = d1 / num; // TRICK -> iki farkli data tipi sayi isleme girerse java
        //kucuk olan data tyoe turu icin aw yapar sonucu buyuk olan data type olarak verir.

        System.out.println("db = " + db);

        double d2 = 14.53;
        int num2 = (int) d2;
            System.out.println("num2 = " + num2);
            int num3=150;
            byte b1= (byte) num3;
            System.out.println("b1 = " + b1);

            double d3 = 333;
            long l = (long) d3;

            double d4=571.4444;
            long l2= (long) d4;
            System.out.println("l2 = " + l2);

            /* task ->
            *kullanicidan bir karakter girmesini isteyin ve
            * girilen karakteri ve ascii degerini yazin
            *
            * ornek : input : a
            * output
            * : girdihiniz 'a' karakterinin ascii degeri :95

            * */

            Scanner sc = new Scanner(System.in);
            System.out.println("asci degeri istedigin karakteri gir : ");
            char ch=sc.nextLine().charAt(0);

            int chasciiDegeri=ch;
            System.out.println(ch+" 'in chasciiDegeri = " + chasciiDegeri);








    }
}
