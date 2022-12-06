package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Set;

public class _04_ZonedDateTime {

    // Başka Zaman bolgelerinin zaman dilimlerini alma

    public static void main(String[] args) {
        ZonedDateTime zdtLokal=ZonedDateTime.now();
        // su andaki bölgenin zaman verdi yani lokal zaman
        System.out.println("zdtLokal = " + zdtLokal);

        // ZonedDateTime zdtIstanbul = ZonedDateTime.now(ZoneID);


        Set<String> zamanBolgeleri=ZoneId.getAvailableZoneIds();
        for (String z : zamanBolgeleri){
            if (z.toLowerCase().contains("stan"))
                System.out.println("z = " + z);

        }
        ZoneId zoneIST= ZoneId.of("Europe/ISTANBUL");
        ZonedDateTime zdtIST=ZonedDateTime.now(zoneIST);

        System.out.println("zdtIST = " + zdtIST);

    }

}
