package Gun16;

import java.util.Scanner;

public class _16_Odev {
    public static void main(String[] args) {

        // 9-  Girilen bir cümledeki kelimelerin baş
        // harflaerini yazdırınız.(Regex kullanmayın)

        Scanner oku=new Scanner(System.in);
        System.out.println("Cumle giriniz=");
        String cumle= oku.nextLine();


        System.out.print(cumle.charAt(0));  // ilk harf
        for (int i=0; i<cumle.length();i++)
        {
            if (cumle.charAt(i)==' ')
                System.out.println(cumle.charAt(i+1));
        }











    }
}
