package Gun42.ZamanDıgerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun= LocalDate.now();
        LocalDate dun= buGun.minusDays(1);

        // bugün dün den sonra mı?
        boolean sonraMi= buGun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        // bugün dün den önce mi?
        boolean onceMi= buGun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        // bugün dün den eşit mi?
        boolean esitMi= buGun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        // bugün artık yıl mı?
        boolean artıkYilMi= buGun.isLeapYear();
        System.out.println("artıkYilMi = " + artıkYilMi);

        // 2 tarih arasında fark var ise farkın en büyük olduğu degeri verir.
        int fark = buGun.compareTo(dun.minusYears(3));
        System.out.println("fark = " + fark);



    }
}
