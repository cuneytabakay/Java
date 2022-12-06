package Gun45;

import java.util.Arrays;

public class JavaVeriTipleriMetodlarda {

    int a1;

    static int a2;

    static void metod1(){

    }
    public static void main(String[] args) {


        int[] dizi1 = {1, 2, 3};
        doProduct2(dizi1);
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        // a)123  b)65 2 3
        // sadece değerleri mi gidiyor
        // yoksa adresi mi gidiyor, yani kendisi mi gidiyor
        // REFERANS tipleri metodlara adresi gider
        // dolayısıyla değerleri değişir, ve returna gerek kalmaz.

        //Stringi davranışı primitive gibi olduğundan sadece değeri
        // metoda gider kendisi değil.

        String isim = "ismet";
        doProduct3(isim);
        System.out.println("isim = " + isim);
    }

    private static void doProduct2(int[] dizi1) {
    }

    public static void doProduct3(String isim) { // buraya değer
        isim="mahmut";


    }
    public static void doProduct(int[] dizi2){
        dizi2[0]=65;
    }
}
