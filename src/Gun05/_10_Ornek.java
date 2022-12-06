package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan kaç bilet istediğini (byte) ve sigorta isteyip istemediğini (boolean olarak)
        // alıp ekrana yazdrınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("Kac bilet istiyorsunuz=");
        byte biletSayisi= oku.nextByte();

        System.out.println("Sigorta istermisiniz=");
        boolean sigortaVarMi=oku.nextBoolean();

        System.out.println("Bilet sayısı=" +biletSayisi+", sigorta="+sigortaVarMi);





    }
}
