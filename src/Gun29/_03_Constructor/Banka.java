package Gun29._03_Constructor;

public class Banka {
    String adi;

    int subeSayisi;

    int kurulusYili;

    public Banka() {
    }
    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }
    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }
    public String toString(){
        return "Banka{" + "adi=" + adi + '\'' + ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili + '}';



    }
}
