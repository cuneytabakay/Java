package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve Soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Cüneyt=");
        String ad=oku.next();

        System.out.print("Abakay=");
        String soyad=oku.next();

        System.out.println("ad ve soyad = " + ad+" "+soyad);

    }
}
