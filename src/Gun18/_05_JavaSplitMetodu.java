package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir stringi parçalara ayırmak demek

        // Kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cümle giriniz = ");
        String cumle= oku.nextLine();

        String[] kelimeler= cumle.split(" ");

        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("kelimeler sayisi = " + kelimeler.length);

        for (int i=0;i< kelimeler.length;i++)
            System.out.println("kelimeler = " + kelimeler[i]);


    }
}
