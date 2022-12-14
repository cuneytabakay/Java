package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {
        long startTime=0;
        String str="";


        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan önceki nokta");
            char ilkHarf = str.charAt(0);
            System.out.println("hatadan sonraki nokta");

        }
        catch (Exception hata)
        {
            System.out.println("Catch bloğu çalıştı"); // hata.printStackTrace();
        }
        finally {
            long gecenSure= System.currentTimeMillis() - startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
            // hata olsun veya olmasın çalışacak final bölümü:
            // her zaman çalışır
            // kullanım sebebi: try catch in içinde yapılmış
            // işlemlerde ortak kalan kapama gibi bu bölüme ait işlemler
            //

        }
        System.out.println("try-catch bloğundan sonra çalışan kısım");
    }
}
