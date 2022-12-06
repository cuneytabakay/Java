package Gun29._01_Constructor;

public class Okul {
    // Bir student sınıfı oluşturunuz,
    // (id(int), name, surName, classroom (int)) ve
    // bundan 3 adet öğrenci oluşturunuz.

    public static void main(String[] args) {
        //1. yöntem
        Student ogr1=new Student(); // () parametre yeri

        ogr1.id=1;
        ogr1.name="Cüneyt";
        ogr1.surName="Abakay";
        ogr1.classroom=15;
        System.out.println("ogr1 = " + ogr1.name);

        Student ogr2=new Student();// () parametre yeri

        ogr2.id=1;
        ogr2.name="Ecrin";
        ogr2.surName="Abakay";
        ogr2.classroom=5;
        System.out.println("ogr2.name = " + ogr2.name);

        //2. yöntem
        Student ogr3=new Student(3, "Abdullah", "Eren", 3);
        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4=new Student(4, "Cüneyt", "Abakay", 7);
        Student ogr5=new Student(5, "Can", "Nedim", 10);
        Student ogr7=new Student(7);





    }
}
