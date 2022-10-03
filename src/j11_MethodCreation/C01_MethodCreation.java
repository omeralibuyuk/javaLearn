package j11_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        System.out.println("javacanlara selam olsun");
        topla();

        System.out.println("bu yaziyi okuduysan yukaridaki method call oldu");
        String a;
        // topla2(a:34, b:43);
        System.out.println("agaya selamlar");

    } // main method kapanis
    public static void topla () {
        int a = 33;
        int b = 23;

        System.out.println(a + b);
        System.out.println("topla methodundan selamlar :) ");
    }

        public static void topla2(String a, String b) {
            System.out.println("bu method parametreli");
            System.out.println(a+b);
            System.out.println("topla2 calisti");
    }
    }






