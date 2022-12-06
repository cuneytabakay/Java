package Gun14;

import java.util.Scanner;

public class _11_Odev4 {
    public static void main(String[] args) {
        // kullanıcıdan ondalıklı bir sayının, tam ve ondalıklı bir kısmını ayrı ayrı alınız.
        // bir sayıları nokta ile birleştirerek tek bir ondalıklı sayı haline getirip sonra YAZDIRINIZ.


        Scanner oku = new Scanner(System.in);
        System.out.println("tamKismi =");
        String tamKismi= oku.next();

        System.out.println("ondalıkKismi =");
        String ondalıkKismi= oku.next();

        String strSayi= tamKismi.concat(".").concat(ondalıkKismi);
        Double sayi= Double.parseDouble(strSayi);

        System.out.println("sayi = " + sayi);




    }
}
