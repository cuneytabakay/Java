package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanların toplamını yazdırınız.


        Scanner oku = new Scanner(System.in);
        System.out.print("Kaça kadar sayılar toplanacak =");
        int sinir= oku.nextInt();

        int sayac=1;
        int toplam=0;

        while (sayac <= sinir){

            if (sayac%2 ==1 )
            toplam=toplam+sayac; // toplanacak sayıları sayac

            sayac++;


        }
        System.out.println("toplam = " + toplam);


    }
}
