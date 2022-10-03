package j01_Variables;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :2
                 Output : Yilda 12.41 kg seker kullaniyorsunuz
         */

        Scanner sc = new Scanner(System.in);

        System.out.print(" günlük ictiginiz cay sayisini girin: ");
        int caySayisi=sc.nextInt();

        System.out.print(" günlük kullandiginiz seker sayisini girin: ");
        int sekerSayisi=sc.nextInt();

        System.out.print(" yillik seker kullaniminiz: " + (caySayisi*sekerSayisi*1.7*365) / 1000 + "kg" );






















    }
}
