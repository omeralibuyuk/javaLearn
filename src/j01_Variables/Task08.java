package j01_Variables;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //kullanicinin sevdigi meyveyi print eden bir code create edin

        Scanner sc = new Scanner(System.in);
        System.out.print(" lütfen sevdiginiz meyveyi girin: ");
        String meyve = sc.nextLine();
        System.out.print(" sevdiginiz meyvenin adi: " + meyve );
    }
}
