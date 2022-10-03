package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // task girilen 3 notun ortalamasini hesaplayan method create edin

        Scanner sc = new Scanner(System.in);
        System.out.println("1 notunuzu girin: ");
        double not1= sc.nextDouble();

        System.out.println("2. notunuzu girin: ");
        double not2=sc.nextDouble();

        System.out.println("3. notu giriniz");
        double not3=sc.nextDouble();
        double ortalaniz=ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamaniz = " + ortalaniz);

    } //main sonu

    private static double ortalamaHesapla (double a, double b, double c){
        return (a+b+c)/3;
    }








}
