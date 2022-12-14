package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        try { // dene, hatanın başladığı yerin üstüne konur
            System.out.println("Program başladı");
            LocalDate tarih = LocalDate.of(2020, Month.JUNE, 40);
            System.out.println("işlem tamam");
        } //hata olduğu zaman programı kırma
        catch(Exception hata)// hata isimli değişkende oluşan hataların bilgisi atanıyor
        {
            System.out.println("şu hata oldu"+hata.getMessage());
            // kendine mail attı gelen datayı ve hatayı
            // veri tabanın kalıcı yer yaz
        }

        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

        try {

            // java çalışmaya devam

        } // anlamadığın yer mi oldu? kırılmadan devam
        catch (Exception hata)
        {
            // hatanın sebebini anla
            //gereken videoları tekrar izle
            // arkadaşlarına, sonra mentöre, sonra hocaya mutlaka sor
            // öğren ve kırılmadan devam et
        }

        // Sonunda seni güzel bir meslek bekliyor





    }
}
