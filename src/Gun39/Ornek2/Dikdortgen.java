package Gun39.Ornek2;

public class Dikdortgen extends Sekil {

    private double kisaKenar;

    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar){
        setkisaKenar(kisaKenar);
        setuzunKenar(uzunKenar);

    }

    @Override
    public double alan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre() {
        return (kisaKenar+uzunKenar)*2;


    }
    public double getKisaKenar() {
        return kisaKenar;
    }
    public void setkisaKenar(double kisaKenar){
        this.kisaKenar = kisaKenar;
    }


        public double getUzunKenar() {
            return uzunKenar;
        }
        public void setuzunKenar(double uzunKenar){
            this.uzunKenar = uzunKenar;

    }
}
