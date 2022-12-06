package Gun37._06_Soru;

public class Dikdortgen implements ISEKIL {

    @Override
    public double alan(double...dizi) {

        if (dizi.length==1)
            return dizi[0]*dizi[1];
        double kisaKenar=dizi[0];
        double uzunKenar=dizi[1];

        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre(double...dizi) {

        if (dizi.length ==1)
            return (dizi[0]+dizi[1])*2;
        double kisaKenar=dizi[0];
        double uzunKenar=dizi[1];

        return (kisaKenar+uzunKenar)*2;


    }
}
