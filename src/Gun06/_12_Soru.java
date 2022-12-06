package Gun06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // Girilen bir stringte boşluk olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir string giriniz=");
        
        String girilen=oku.nextLine();

        System.out.println("bosluk var Mı = " + girilen.contains(" "));

        
    }
}
