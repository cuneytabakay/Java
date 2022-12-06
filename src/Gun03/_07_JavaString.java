package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {

        int sayi=5;

        String ad= "Cüneyt";  // String ifadelerin sayı gibi bir sınırı olmadığından "" tırnak ile sınırı belli edilir.
        String soyad="Abakay"; // Abakay\0 özel karakter koyarak sınırını belirliyor.

        System.out.println("ad");  //  ad
        System.out.println("ad"); // Cüneyt

        System.out.println("ad"+"soyad"); // ad soyad
        System.out.println(ad+soyad);  // CüneytAbakay

        System.out.println(ad+" "+soyad);

        String tamIsim = ad+soyad; //CüneytAbakay
        String tamIsim2= ad+" "+soyad; // Cüneyt Abakay

        System.out.println("tamIsim = " + tamIsim);
        System.out.println("tamIsim2 = " + tamIsim2);

        int yas=37;
        int kilo = 80;

        String bilgi= ad+soyad+yas+kilo; // sayılar String le toplkanırsa kelime gibi işlem görür
        System.out.println("bilgi = " + bilgi);
        System.out.println(ad+" "+soyad+" "+yas+" "+kilo);




    }
}
