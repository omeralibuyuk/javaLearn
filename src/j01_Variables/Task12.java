package j01_Variables;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        // bir boolean olusturun. Konsola  bir banka hesabiniz var mi yazdiirn varsa true yoksa false olarak konsola
        // cevap verin.

        Scanner sc = new Scanner(System.in);

        Boolean banka;

        System.out.print(" Banka hesabiniz var mi?: <V>ar - <Y>ok: ");

        String cevap = sc.next();

        banka = cevap.equals("V");

        System.out.print(banka);











    }
}
