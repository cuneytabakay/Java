package Gun27._01_Ornek;

public class Person {
    // properties
    String name;

    String surname;

    int age;
    // class method 3. yöntem

    public void BilgiYazdir()
    {
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }
    public void getBirtYear() {
        System.out.println("Doğum Yılı= " + (2022-age));

    }
    public void getInitials()
    {
        System.out.println(name.toUpperCase().charAt(0)+"." + name);
    }

}
