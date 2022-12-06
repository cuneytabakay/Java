package Gun30.DigerErisimler.İki;

import Gun30.DigerErisimler.Bir.Kitap;

import javax.tools.Diagnostic;

public class AmazonStore {
    public static void main(String[] args) {
        //Kitap kit1=new Kitap();
       //kit1.name="Yeni Java Kitabı";
        // Başka paketten bu yapıcı metoda ve field a erişemedik.
        // Çünkü erişim belirteci default

        Kitap kit2=new Kitap( "Algoritma Kitabı");
    }
}
