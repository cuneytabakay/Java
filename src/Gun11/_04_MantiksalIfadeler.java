package Gun11;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {

        // Mantıksal (lojik) ifadeler
        // && -> ve || -> veya


        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi.
        // değilse uygun sayi girilmedi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Sayı giriniz=");
        int sayi= oku.nextInt();

        if (sayi > 0 && sayi%2==1) {
            System.out.println("Sayı uygun girildi");
        }
        else
        {
            System.out.println("uygun sayı girilmedi");
        }




    }
}
