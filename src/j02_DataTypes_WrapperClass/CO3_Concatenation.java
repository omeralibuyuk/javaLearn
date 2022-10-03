package j02_DataTypes_WrapperClass;

public class CO3_Concatenation {
    public static void main(String[] args) {

        String ad="Ömer";
        String soyad="Büyük";

        int a=7;
        int b=11;
        // birden cok String ve variable ile farkli data type variable`ler + ile isleme alinirsa
        // java birlestirme yaparak yeni bir String olusturur

        System.out.println(ad+soyad+a+b);

        System.out.println(a+b+ad+soyad);

        System.out.println(a+b+ad+soyad);

        System.out.println(ad+soyad+(a+b));

        char ch='1';
        System.out.println(ad+ch);

        System.out.println(a+ch+ad);

        System.out.println(ad+(ch+b));

        System.out.println(a+ad+ch);


















    }
}
