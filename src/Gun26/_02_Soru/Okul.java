package Gun26._02_Soru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Öğrenci bilgilerini alan modül yazılacaktır.
        // Öğrenciye ait bilgileri (adi, soyadi, sinifi ve adres) vardır.
        // Kullanıcıdan 3 adet öğrenci bilgileri alarak doldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.


        ArrayList<Ogrenci> snf=new ArrayList<Ogrenci>();
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for (int i=1; i<=3; i++) {

            Ogrenci ogr = new Ogrenci();
            System.out.print("Ogrenci Adı=");
            ogr.adi = oku.nextLine();
            System.out.print("Ogrenci Soyadı=");
            ogr.soyadi = oku.nextLine();
            System.out.print("Ogrenci Sınıfı=");
            ogr.sinifi =okuInt.nextInt();
            System.out.print("Ogrenci Adresi=");
            ogr.adres = oku.nextLine();

            snf.add(ogr);
        }
        for (Ogrenci ogr : snf)
        {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adres = " + ogr.adres);

        }



    }
}

class Ogrenci{

    String adi;

    String soyadi;

    int sinifi;

    String adres;


}
