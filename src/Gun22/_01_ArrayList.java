package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        //array : Boyut sayısının belli olduğu durumlardaki verier için kullanılır.
        //
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirilemiyor.



        // String arraylist tanımlayalım
        ArrayList<String> isimler=new ArrayList<>();

        // Eleman Ekleme
        isimler.add("Abdullah"); // uzunluğu 1 oldu
        isimler.add("Ecrin"); // uzunluğu 2 oldu
        isimler.add("Cüneyt");
        isimler.add("Nedim"); // hep sonuna ekliyor.

        System.out.println("isimler = " + isimler); // hızlı yazdırma yöntemi
        System.out.println("isimler lenght = " + isimler.size() ); // dizilerdeki lenght e karşılık geliyor.



    }
}
