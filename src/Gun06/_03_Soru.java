package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son harfini yazdırınız
        // Merhaba -> length : 6
        // yani Lenght -1 i bana son harfin index ini verir

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir string deger giriniz= ");
        String girilen= oku.nextLine();

        int uzunluk= girilen.length();
        char sonHarf= girilen.charAt(uzunluk-1); // Toplam karakter sayısı okundu.
        // Fakat charAt indexe göre çalıştığından 1 eksiği alındı.

        System.out.println("sonHarf = " + sonHarf);
        System.out.println("sonHarf = " + girilen.charAt(girilen.length()-1));







    }
}
