package Gun30.Protected.bir;

public class HastaneAnkara {
    public static void main(String[] args) {
        Doktor dok1=new Doktor();
        dok1.adi = "Cüneyt";
        // protectedlara sadece kendi paketindekiler erişebilir

        Doktor dok2=new Doktor("Abdullah Eren");

    }


}
