package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.println("2. Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.println("Toplama T\nÇıkartma Ç\nÇarpma P\nBölme B\n giriniz=");
        Scanner okuStr = new Scanner(System.in);
        String islem=okuStr.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam= = " + (sayi1+sayi2));




    }
}
