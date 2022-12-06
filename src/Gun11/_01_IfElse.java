package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.


        Scanner oku = new Scanner(System.in);
        System.out.println("Notu giriniz= ");
        int ogrNot = oku.nextInt();

        if (ogrNot >= 50) { // hangi not girilirse girilsin burası herzaman kontrol edilir.
            System.out.println("geçtiniz");
        }

        if (ogrNot < 50) {
            System.out.println("kaldınız");
        }

        }



    }

