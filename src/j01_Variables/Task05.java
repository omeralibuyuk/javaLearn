package j01_Variables;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner scan = new Scanner(System.in);

        System.out.print("lütfen karenin kenarini giriniz :");

        int kenar = scan.nextInt();

        System.out.println("alan : " +(kenar*kenar));
        System.out.println("cevre : " + (kenar*4));
















    }
}
