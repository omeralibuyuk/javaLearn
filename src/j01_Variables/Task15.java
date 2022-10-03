package j01_Variables;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6
         */

        Scanner sc = new Scanner(System.in);

        System.out.println(" lütfen ara notunuzu girin: ");
        int araNot = sc.nextInt();

        System.out.println(" lütfen final notunuzu girin: ");
        int finalNotu = sc.nextInt();

        System.out.println(" lütfen proje notunuzu girin: ");
        int projeNotu = sc.nextInt();

        double genelNotOrtalamasi = araNot*0.30 + finalNotu*0.50 + projeNotu*0.20;

        System.out.println(" Not ortalamiz: " + genelNotOrtalamasi);


    }
}
