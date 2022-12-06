package Gun28._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        // 1. yöntem javanın kendi metodlarıyla yapılan çevirme işlemleri
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);

        Utility util=new Utility();
        strRakam = util.getString(sayi);
        intRakam = util.getInt(strRakam);

        Math.max(3,4);
        strRakam = Utility.getStrin2(sayi);
        intRakam = Utility.getInt2(strRakam);

        System.out.println("strRakam = " + strRakam);
        System.out.println("intRakam = " + intRakam);



    }
}
