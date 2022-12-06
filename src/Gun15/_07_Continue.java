package Gun15;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {

        // kullanıcan 5 sayı isteyiniz
        // bu sayılardan 6 ile 10 arasındakiler toplansın

        Scanner oku=new Scanner(System.in);
        int toplam=0;
        for (int i=1;i<5;i++) {

            System.out.println("Bir sayı giriniz = ");
            int sayi = oku.nextInt();

            if (sayi > 6 && sayi < 10)
                continue;

            toplam = toplam + sayi;
            System.out.println("toplam = " + toplam);
        }





    }
}
