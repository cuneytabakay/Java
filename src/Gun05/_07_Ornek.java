package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcının ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz......ve kilonuz....şeklinde yazınız.
        // vücut kitle endeksinide bularak yazdırınız (kilo/ boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("Kilonuz=");
        double kilo=oku.nextDouble();

        System.out.print("Boyunuz (cm)=");
        int boy= oku.nextInt();

        double kitleIndeksi= kilo / (boy*boy);
        System.out.println("kitleIndeksi = " + kitleIndeksi);
        System.out.println("boy= " + boy +", kilonuz="+kilo+", indeksiniz= " + kitleIndeksi);




    }
}
