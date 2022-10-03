package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        System.out.println("agam notu gir :");
        int not = sc.nextInt ();
        if (not<0 & not>100) {
            System.out.println("agam negatif ve 100 den büyük not olmaz adam gibi bir seyler gir: ");
        } else if (not<50) {
            System.out.println("D"); } else if (not<60) {
            
        }

    }
}
