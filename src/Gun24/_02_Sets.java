package Gun24;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS : HashSet (hızlı),
        // LinkedHashSet(ekleme sırasıgöre sıralı),
        //TreeSet(herzaman sıralı)

        // Hızlı çalışmak için kendi özel algoritma sırasına göre saklar

        // Ekleme sırasına göre elemanlarını tutuyor
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("bes");
        System.out.println("lhs = " + lhs); // lhs = [bir, iki, üç, dört, bes]

        //Alfabetik olarak sıralı tutar.
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("bes");
        System.out.println("ts = " + ts); // [bes, bir, dört, iki, üç]

        // sayısal sıraya göre sıralı tutuyor.
        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(17);
        ts2.add(1);
        System.out.println("ts2 = " + ts2);


    }
}
