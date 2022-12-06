package Gun05;

import java.util.Scanner;

public class _03_Onek {
    public static void main(String[] args) {

        // Kullanıcıdan Adını ve Soyadını olarak ekrana yazdırınız.

        Scanner oku=new Scanner(System.in); // okuyucuyu bi kere tanınmlamnız gerekiyor.

        System.out.print("Cüneyt Abakay"); // ekrana gelen veri girişinin ne için olduğunu
        // kulanıcıya belirtmek için zorunlu değil. LN yi sildik çünkü kursor yanında olsun

        String adsoyad= oku.nextLine(); // okuma işi bu noktada yapılıyor. bizde okunan değeri değişkene eşitliyoruz.
        System.out.println("adsoyad = " + adsoyad); // okunan değer doğru mu okundu diye ekrana yazdırıyoruz.





    }
}
