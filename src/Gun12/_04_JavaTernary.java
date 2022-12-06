package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi giriniz=");
        int sayi= oku.nextInt();

        // Klasik yöntem
        if (sayi %2 == 1)
            System.out.println("tek");
        else
            System.out.println("çift");

        // TEK SATIRDA YAZMA YÖNTEMİ : TERNARY

        String sonuc = (sayi %2 == 1) ? "tek" : "çift";
        System.out.println("sonuc = " + sonuc);
        // şart doğru ise il bölüm değil se son bölüm çalışır.
        System.out.println ( ((sayi %2 == 1) ? "tek" : "çift") );




    }
}
