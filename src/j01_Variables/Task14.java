package j01_Variables;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        //kullanicinin boyunu Float eden ve babasiyla arasindaki boy farkini bulan code create ediniz

        Scanner sc = new Scanner(System.in);

        System.out.print(" lütfen boyunuzu girin: ");

        float boy = sc.nextFloat();

        System.out.print(" lütfen babanizin boyunu girin: " );

        float babanizinBoyu = sc.nextFloat();

        System.out.print(" babaniz ile aranizdaki boy farki: " + (boy - babanizinBoyu) + " cm ");















    }
}
