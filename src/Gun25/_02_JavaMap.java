package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız.

        Map<String, String> nKartvizit=new HashMap<>();
        nKartvizit.put("isim","Cüneyt");
        nKartvizit.put("email", "cuneytabakay@hotmail.com");
        nKartvizit.put("adres", "Almanya");
        nKartvizit.put("telefon", "05533328662");

        System.out.println("sKartvizit.get(isim) = " + nKartvizit.get("isim"));
        System.out.println("sKartvizit.get(telefon) = " + nKartvizit.get("telefon"));

        Map<String, String> kKartvizit=new HashMap<>();
        kKartvizit.put("isim","Cüneyt");
        kKartvizit.put("email", "cuneytabakay@hotmail.com");
        kKartvizit.put("adres", "Manisa");
        kKartvizit.put("telefon", "05533328662");

        Map<String, Map<String, String>> kartDefteri=new HashMap<>(); // Maplerin MAP i
        kartDefteri.put("cüneyt", nKartvizit); // cüneyt anahtarına Cüneyt in Kartviziti atandı
        kartDefteri.put("cüneyt", nKartvizit);

        System.out.println("cüneytin telefonu = " + kartDefteri.get("cüneyt").get("telefon"));


        for (Map.Entry<String, Map<String, String>> kartVizit: kartDefteri.entrySet()){
            System.out.println("kartVizit = " + kartVizit);
        }
    }
}
