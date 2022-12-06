package gun02;

public class _05_Degiskenler {
    public static void main(String[] args) {
        // Degiskenler

        int sayi;  // int : int miktarınca alan kaplayan tam sayı tipi

        sayi=5;  // sayının degeri 5
        System.out.print("sayi=");   // kelime olarak sayı
        System.out.println(sayi);  // bu durumda degişkenin degerini yazar
        System.out.println("sayı="+sayi); // bu durumda ikisini birlikte yazar

        sayi=7; // sayının degeri 7

        int kisaKenar=5;
        int uzunKenar=7;
        int çevre=5+5+7+7;

        System.out.println("cevresi="+çevre);

        kisaKenar=sayi; // sayının değeri kisaKenara atandı KisaKenar=7
        çevre = (kisaKenar+uzunKenar)*2; // bilgisayarda çarpma işareti * dır
        System.out.println("çevre = " + çevre);
        System.out.println("çevre = " + çevre);



    }
}
