package j08_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
       int kerimYas=45;
       int ismailYas=63;
       if (kerimYas==ismailYas) {
           System.out.println("ayni yasdasiniz güzel insanlar");
           System.out.println("yoksa siz ikiz misiniz? ");
       }

        if (kerimYas>=40) {
            System.out.println("kerem bey olgunluk yasindasiniz");
        System.out.println("bu yaziyi okudu iseniz 12. satirdaki if'den bagimsiz");}

        if (kerimYas+ismailYas>100) {
            System.out.println("kerim bey ve ismail bey yaslari toplami 100'den büyük");
        }
        System.out.println("selam javacanlar");

        /* bagimsiz if statementleri yapilari kendi scop kapsamlari run eder
        birden fazla bagimsiz if statemnt yaoilari hepsinin body calisabilecegi gibi hicbirisini body de calismayabilir.
         */

















    }
}
