package Gun37._03_Ornek;

public class Geometri {
    public static void main(String[] args) {
        // bir interface in birden class tarafından implemente edilmesi
        Cember c=new Cember(); // bütün metodlara erisim var
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();
        // İnterface lerden nesne üretilme fakat referans tipi
        //oluşturabilir. bu bize Polymorphism sağladı

        ICizdirir c2=new Cember(); // direk olarak sadece interfacedeki
        // ismi verilmiş olanlar metodlara erişebilirsin
        c2.ciz();
    }
}
