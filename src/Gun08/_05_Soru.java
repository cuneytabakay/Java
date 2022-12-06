package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir kelime giriniz= ");
        String kelime= oku.next();

        Character ilkHarf=kelime.charAt(0);
        Character sonHarf=kelime.charAt(kelime.length() -1 ); // Cüneyt -> lenght 6

        System.out.println("ilkHarf ve Sonharf = " + ilkHarf+" "+sonHarf);





    }
}
