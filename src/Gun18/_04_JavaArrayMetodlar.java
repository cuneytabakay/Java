package Gun18;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Arrays.toString(dizi) -> diziyi string olarak direk yazdırır.
        String[] isimler={"cüneyt","ecrin","abdullah","dede","nene"};
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        // Arrays.sort(isimler) -> diziyi sıralar
        Arrays.sort(isimler);
        System.out.println(".sort = " + Arrays.toString(isimler)); // yukarıda öğrendiğimizle yazdıralım.

        // Diziler eşit mi? Arrays.equals(dizi1,dizi2)
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); //

        Arrays.sort(c);
        System.out.println("c = " + Arrays.toString(c));

        // Arrays.fill -> bütün kutucuklara 7 atar;
        Arrays.fill(c, 7);
        System.out.println("c = " + Arrays.toString(c));

        // Arrays.binarySearch(rakamlar, 5) -> Sıralı dizide aranan elemanın indexi verir
        // aranan eleman birden fazla ise herhangi birini verebilir.
        int[] rakamlar={2,7,4,6,23,5,5};
        System.out.println("rakamlar = " + Arrays.binarySearch(rakamlar, 5));
        Arrays.sort(rakamlar);
        System.out.println("rakamlar = " + Arrays.binarySearch(rakamlar, 5));






    }
}
