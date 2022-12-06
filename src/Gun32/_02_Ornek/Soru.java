package Gun32._02_Ornek;

import java.util.ArrayList;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.

    public static void main(String[] args) {
        User user1 = new User("cüneyt", Statu.AKTIF, Role.ADMIN);
        User user2 = new User("abdullah", Statu.AKTIF, Role.PERSONEL);
        User user3 = new User("ecrin", Statu.AKTIF, Role.MUDUR);

        UserSil(user1);
    }
    public static void UserSil(User user)
    { // ADMİN SİLİNEMEZ
        if (user.role == Role.ADMIN)
        {
            System.out.println("Admin silinemez");

        }

    }


}
