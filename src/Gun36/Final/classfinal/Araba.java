package Gun36.Final.classfinal;

public class Araba extends Tasit {
    private String renk;

    public Araba (String model) {
        super(model);
    }
    public void arabaYazdir(){
        System.out.println("renk = " + renk);

//    @Override
//    public String toString() { // miras alınan class daki FİNAL metodları değiştiremeyiz
//        return super.toString();
    }
}
