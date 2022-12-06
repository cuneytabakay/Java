package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        // 6 7 3 8 1 -> 25    25/5  ->  0rt=5   ortalamadan büyük kaç eleman var 3


        int[] dizi=new int[5];

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i=0;i<5;i++){
            System.out.print((i+1)+".Sayi giriniz=");
            dizi[i]= oku.nextInt();
            toplam=toplam+dizi[i];
        }

        double ortalama= toplam/dizi.length;
        System.out.println("ortalama = " + ortalama);

        int adet=0;
        for (int i=0;i<dizi.length;i++)
        {
            if (dizi[i]>= ortalama)
                adet++;

        }

        System.out.println("Ortalamadan büyük sayi miktarı = " + adet);


    }
}
