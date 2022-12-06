package Gun16;

import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
        // 5. Sayı bulmaca oyunu tam hali ile çözünüz. bu soruya bakabilirmiyiz.

        Scanner oku=new Scanner(System.in);

        int tutulanSayi= (int) (Math.random()*10);
        int tahmin=0;
        int tahminSayisi=0;


        do {
            System.out.print("Sayi giriniz=");
            tahmin=oku.nextInt();

            if (tahmin < tutulanSayi)
                System.out.println("Büyük Sayı Giriniz.");

            if (tahmin > tutulanSayi)
                System.out.println("Küçük Sayı Giriniz.");

            if (tahmin == tutulanSayi){
                System.out.println("tebrikler");
                break;
            }
            if (tahminSayisi == 10) {
                System.out.println("Tahmin Etme Hakkınız Doldu");
                break;
            }
            tahminSayisi++;
        }while (tutulanSayi != tahmin);




    }
}
