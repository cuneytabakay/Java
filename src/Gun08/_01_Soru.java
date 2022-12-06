package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Ayrı ayrı girilen ad ve soyadı aralarında bir bosluk koyarak birleştiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("Adınızı giriniz=");
        String ad= oku.next();

        System.out.println("Soyadınızı giriniz=");
        String soyad= oku.next();

        String adSoyad= ad.concat(" ").concat(soyad);
        System.out.println("adSoyad = " + adSoyad);






    }

}
