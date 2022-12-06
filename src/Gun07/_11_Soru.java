package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz
        // 01.02.20 bu stringde kaç tane nokta vardır
        // 01.2001

        Scanner oku=new Scanner(System.in);

        System.out.print("Lütfen bilgiyi giriniz = ");

        String girilen= oku.nextLine();

        int uzunluk1= girilen.length();
        String noktasiz = girilen.replace("." , ""); // noktaları yok edildi
        System.out.println("noktasiz = " + noktasiz);
        int uzunluk2= noktasiz.length();

        System.out.println("nokta sayısı = " + (uzunluk1 - uzunluk2));





    }
}
