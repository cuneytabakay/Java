package Gun26._05_Soru;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için aşağıdaki özellikte bilgilerin
        // kaydedileceği classları yazınız.
        // Okul : adı, müdür, ücreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.


        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1;
        ogr.tamAd="cüneyt abakay";

        Okul ok=new Okul();
        ok.adi="Atatürk okulu";
        ok.mudurAdi="Ecrin Abakay";
        ok.ucreti=9000;

        ogr.okulu = ok;

        System.out.println("ogr = " + ogr.okulu.adi);


    }
}
