package Gun42.StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1="bugün hava çok güzel";
        String cumle2="bugün hava çok güzel";
        String cumle3= new String("bugün hava çok güzel");
        String cumle4= new String("bugün hava çok güzel");


        if (cumle1 == cumle2) // ilkel tipler için değerleri aynı mı, Nesneler için aynı nesne mi?
            System.out.println("Cumle1 Cumle 2 ye eşit");
        else
            System.out.println("Cumle1 Cumle 2 ye eşit DEĞİL");

        if (cumle1.equals(cumle2)) // ilkel tipler ve nesneler için değerleri aynı mı?
            System.out.println("Cumle1 Cumle 2 ye eşit");
        else
            System.out.println("Cumle1 Cumle 2 ye eşit DEĞİL");

        //***********************nesneler için sonuçlar******************/
        if (cumle3 == cumle4) // ilkel tipler için değerleri aynı mı, Nesneler için aynı nesne mi?
            System.out.println("Cumle3 Cumle 4 ye eşit");
        else
            System.out.println("Cumle3 Cumle 4 ye eşit DEĞİL"); // cumle 3 cumle4 eşit değil

        if (cumle3.equals(cumle4)) // ilkel tipler ve nesneler için değerleri aynı mı?
            System.out.println("Cumle3 Cumle 4 ye eşit"); // cumle3 cumle4 eşit
        else
            System.out.println("Cumle3 Cumle 4 ye eşit DEĞİL");



    }

}
