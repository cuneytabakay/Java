package Gun27._01_Ornek;

public class Ornek {
    public static void main(String[] args) {

        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım :getBirthYear isminde Person a ait bir metod yazınız,
        // çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        //şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.



        Person kisi1 = new Person();
        kisi1.name = "Cüneyt";
        kisi1.surname = "Abakay";
        kisi1.age = 37;

        Person kisi2 = new Person();
        kisi2.name = "Abdullah";
        kisi2.surname = "Abakay";
        kisi2.age = 10;

        //1. YÖNTEM
        System.out.println("kisi1 = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        System.out.println("kisi2 = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        System.out.println();

        // 2. yöntem metod
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);

        System.out.println();
        //3. yöntem
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        System.out.println();
        kisi1.getBirtYear();
        kisi2.getBirtYear();
    }

    public static void BilgiYazdir(Person kisi) { // 2. yöntem
        System.out.println("kisi = " + kisi.name);
        System.out.println("kisi.surname = " + kisi.surname);
        System.out.println("kisi.age = " + kisi.age);
    }
}