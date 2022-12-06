package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {

        String girilenKelime="65"; // bu haliyle mesela Ahmet kelimesinde farksız toplama tapılamaz
        System.out.println("girilenKelime = " + girilenKelime);

        // Kelimenin-> sayıya çevrilmesi
        int intDeger = Integer.parseInt(girilenKelime);
        double doubleDeger = Double.parseDouble(girilenKelime);

        System.out.println("girilenKelimeninSayiHali = " + intDeger);
        System.out.println("doubleHali = " + doubleDeger);

        int toplam= intDeger + intDeger;
        /*Bugün hava 15 derece
        görüntü rakam olsa bile toplanamadığı için yazıdır
        burada kelime olarak geciyor
        aslında bunu on beş gibi düşünebiliriz
        Bu-> Kelime
        gün -> kelime
        hava ->kelime
        15 -> kelime toplama yapamazsın bu yüzden
        int dereceSayi= Integer.parseInt(dereceYazi);*/


         /* Rakamı yazıya çevirmek diyelim */
        // Hava sıcaklığını rakam olarak tanımlayınız ve bir cümle şeklinde
        // Bu gün hava 12 derece yazdırınız.
        int sicaklik =12;
        System.out.println("Bugun hava " + sicaklik+"derece."); // otomatik hali
        System.out.println("Bugun hava " +Integer.toString(sicaklik)+"derece."); // dönüştürüldü



    }
}
