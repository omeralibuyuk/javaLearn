package j01_Variables;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        /*  TASK06 HİPOTENÜS BULMA
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.*/

        Scanner sc = new Scanner(System.in);

        System.out.println(" lüften ilk kenari giriniz: ");
        double k1 = sc.nextDouble();

        System.out.println(" lütfen ikinci kenari girin: ");
        double k2 = sc.nextDouble();

        double k3 = Math.sqrt((k1*k1)+(k2*k2));

        System.out.println(" ücgenin birinci dik kenari: " + k1 + "\n Ücgenin hiponetüsü: " +k3);






























    }
}
