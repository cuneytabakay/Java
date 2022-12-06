package Gun32._01_Ornek;

public class Ornek1 {
    public static void main(String[] args) {
        // verilen bir ayNo ya göre, girilen ayın kaç gün sürdüğünü bulunuz.
        int ayNo=5;

        switch (ayNo){
            case 2:System.out.println(28);break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30);break;

        }

        String ad="Mayıs";

        switch (ad){
            case "şubat" :System.out.println(28);break;
            case "ocak" :
            case "mart" :
            case "Nisan":
            case "agustos":
            case "EYLUL":
            case "Ekim":
            case "Aralık":System.out.println(31);break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "KASIM":System.out.println(30);break;



        }
    }
}
