package j07_Logical_Mantiksal_Operators;

public class C01_MantiksalOperator {
    public static void main(String[] args) {

        boolean b1 = true;

        int a = 3;
        int c = 7;

        System.out.println(b1 & (a < c));

        System.out.println(b1 && (a > c));

        System.out.println(b1 & (a == c));

        //or - veya

        System.out.println(b1||(a<c));

        System.out.println(b1||(a>c));

        System.out.println(b1||(a==c));

        //not->!







    }
}
