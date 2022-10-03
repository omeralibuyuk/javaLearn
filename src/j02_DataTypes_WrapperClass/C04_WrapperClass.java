package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {
        String name="Ömer";
        int yas=33;

        System.out.println( name.toUpperCase()); //büyük harfli yazdirir

        String tc="12345";
        String id="67890";
        System.out.println(tc+id);



        int yeniTc= Integer.valueOf(tc);
        System.out.println("yeniTc = " + yeniTc);

        int yeniId= Integer.valueOf(id);
        System.out.println(yeniId+yeniTc);
        System.out.println("yeniId = " + yeniId);

        String okulNo="234543l";
       // int yeniOkulNo= Integer.valueOf(okulNo);
       // System.out.println("yeniOkulno = " + yeniOkulNo);


        System.out.println("madem geldin dünyaya otur calis javaya");

        // Task -> byte short int max ve min degerleri print eden code yaziniz

       byte maxByteDegeri = Byte.MAX_VALUE;
       byte minByteDegeri = Byte.MAX_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int a=5;

        System.out.println(a); //5
        System.out.println(5); //5



    }
}
