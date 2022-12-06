package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılmak isteniyor.
        // Her öğrencinin okul no (int), tamAdi(String), ve notu (int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün sınıfı bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız.

        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        ArrayList<Ogrenci> snf=new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("okul no=");
            ogr.okulNo = okuInt.nextInt();
            System.out.print("Tam Ad=");
            ogr.tamAd = oku.nextLine();
            System.out.print("notu=");
            ogr.not = okuInt.nextInt();

            snf.add(ogr);
        }
        bilgiYazdir(snf);
        ortalamaYaz(snf);

    }
    public static void bilgiYazdir(ArrayList<Ogrenci> snf){

        for (Ogrenci ogr : snf)
            System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not);


    }

    public static void ortalamaYaz(ArrayList<Ogrenci> snf){
        int toplam=0;

        for (Ogrenci ogr : snf)
            toplam=toplam+ogr.not;

        System.out.println("ortalama=" + (toplam / snf.size()));

    }

}
