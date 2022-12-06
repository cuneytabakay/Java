package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;
        // default olarak tam sayıların hepsini İNT kabul eder
        // default olarak ondalıklı sayıların hepsini DOUBLE kabul eder


        byte byteDeger=7;
        short shortDeger=1645;
        int intDeger=25000;
        long longDeger=23233333333L;

        float floatDeger=3.1400016F;  // ondalıklı sayıları default olarak DOUBLE kabul ettiğinden
                                 // sanuna F (float) eklendi, sayıya hiç bir etkisi yoktur
        double doubleDeger=3.14000001; // her iki tarafta double oldugundan ek bilgiye ihtiyaç olmadı

        char basHarf='A';
        char basHarf2=65;  // karakter tablosunda 65 A ya karşılık geldiği için sayısınıda atayabiliriz.
        boolean evetMi= true;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("basHarf2 = " + basHarf2);
        System.out.println("evetMi = " + evetMi);



    }
}
