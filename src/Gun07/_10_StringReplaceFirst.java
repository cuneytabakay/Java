package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst : Replkace ile aynı , sadece ilşk bulunanı değiştirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text);

        //Merh_b_Düny_

        System.out.println("bütün a lar değiştirelim = " + text.replace("a" , "_"));

        System.out.println("sadece ilk a yı değiştirelim = " + text.replaceFirst("a" , "_"));
        // Merh_ba Dünya




    }
}
