package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // Kullanıcı 0 değeri girene kadar, girdiği sayıların toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int sayi= oku.nextInt();


        int toplam=0;
        while (sayi !=0){
            toplam = toplam+sayi;
            System.out.print("Sayi giriniz=");

            sayi=oku.nextInt();
        }
        System.out.println("toplam = " + toplam);










    }
}
