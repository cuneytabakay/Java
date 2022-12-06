package Gun25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenekte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String, String> sozluk=new TreeMap<>();

        Scanner okuInt=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        String kelime="";
        String anlami="";

        int secim=0;
        do {
            System.out.println("MENÜ\n1- EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4- ARAMA\n5- SİLME\n6- ÇIKIŞ");
            secim= okuInt.nextInt();

            switch (secim){
                case 1:
                    System.out.print("Kelimeyi giriniz=");
                    kelime=oku.nextLine();
                    System.out.print("Anlamı giriniz=");
                    anlami=oku.nextLine();
                    sozluk.put(kelime, anlami);
                    //ekleme işlemleri
                     break;
                case 2: // TODO : Kelime var mı yok mu kontrolü yapılacak
                    System.out.print("Düzeltilecek Kelimeyi giriniz=");
                    kelime=oku.nextLine();
                    System.out.print("Anlamını giriniz=");
                    anlami=oku.nextLine();
                    sozluk.put(kelime, anlami);
                    break;
                case 3:
                    System.out.println("sozluk = " + sozluk);
                    // listeleme işlemleri
                    break;
                case 4: // arama işlemleri : kelimenin bir kaç harfini girdiğinde yine en yakın kelimeyi
                    break;
                case 5: // SİLME işlemleri
                    break;
            }





        }while (secim<6);

        // TODO : bütün işlemler burada yapıldıktan sonra , METOD ile bütün işlemleri ayırınız.





    }
}
