package Gun21;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=6;
        int s3=17;
        int s4=45;


        int sonuc1= toplam(s1,s2);
        int sonuc2= toplam(s1,s2,s3);
        int sonuc3= toplam(s1,s2,s3,s4); // aynı bu şekilde tipleri aynı fakat sayıları farklı ise
        // bu tip durumlar için bir kolaylık sağlanmış.
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplam(int... sayilar){ // kaç sayı gelirse gelsin onları dizi şekline alıyor.
        int toplam=0;
        for (int i=0;i< sayilar.length;i++)
            toplam=toplam+sayilar[i];

        return toplam;
    }







    }

