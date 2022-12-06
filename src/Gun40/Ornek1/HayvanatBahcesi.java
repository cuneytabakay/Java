package Gun40.Ornek1;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kd=new Kedi("Kartal", false, "2015");
        System.out.println("kd = " + kd);

        Kartal kr=new Kartal("Kartal", true, "2013");
        System.out.println("kr = " + kr);
    }
}
