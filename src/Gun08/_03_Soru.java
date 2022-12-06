package Gun08;

import java.util.Locale;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki A harfi sayısını bulunuz. (Büyük küçük harf ayrımı olmadan)

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cumle giriniz= ");
        String cumle= oku.nextLine();

        int u11=cumle.replace("A" , "").replace("a" , "").length();
        int u12=cumle.toLowerCase().replace("a" , "").length();
        int u13=cumle.toUpperCase().replace("A" , "").length();
        int u14=cumle.replaceAll("[Aa]" , "").length();







    }
}
