package Mentoring;

import java.util.Arrays;

public class javaArray {
    public static void main(String[] args) {







        int[] numericArray = new int[10];
        // ilk tanımladığımız arraya sonradan veri ekleyebiliriz.
        //örn:
        numericArray[0]=5;

        int[] numericArray2 = {2,3,4,5,6,7,8};
        // Burada 2. array tanımlama şeklinde yeni bir eleman eklemek mümkün değil

        // 2 çeşit array yazdırma yöntemi var.
        System.out.println("numericArray2 Arrays values = " + Arrays.toString(numericArray2));
        System.out.println("numericArray Arrays values = " + Arrays.toString(numericArray));

        // Array Doldurma =
        Arrays.fill(numericArray,18);
        System.out.println("numericArray Arrays values after filling with 18 = " + Arrays.toString(numericArray));

        // Döngü ile Array doldurma=
        for (int i=0;i< numericArray.length;i++){
            numericArray[i]= (int)(Math.random()*100)+1;

        }
        System.out.println("numericArray Arrays values after shorting = " + Arrays.toString(numericArray));




    }
}
