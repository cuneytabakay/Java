package Gun05;

import java.util.Scanner;

public class _0_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);
        // oku ismine bir okuyucu nımlandı, (System.in) klavyden giriş yapmak üzere

        System.out.print("Sayi Giriniz=");

        int sayi=okuyucu.nextInt();
        // oku.nextInt() ekrandan sayıyı aldıve bizde sayi değişknine attık

        System.out.println("sayi = " + sayi);
        


    }
}
