package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {

        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz......ve kilonuz....şeklinde yazınız.
        // vücut kitle endeksinide bularak yazdırınız (kilo/ boy*boy)

        double kilo = 80;
        int boy=175;

        double kitleendeksi1 = kilo/ (boy*boy);
        int kitleendeksi2 = (int)kilo/ (boy*boy);

        System.out.println("boyunuz = " + boy +" "+"kilonuz="+ kilo);
        System.out.println("kitleendeksi1 = " + kitleendeksi1);
        System.out.println("kitleendeksi2 = " + kitleendeksi2);




    }
}
