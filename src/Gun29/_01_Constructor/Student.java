package Gun29._01_Constructor;

public class Student {
    int id;
    String name;
    String surName;
    int classroom;
    // yapıcı method: Constructor

    public Student(){
    this(0, "", "", 0);
    }

    public Student(int id1, String name1, String surName1, int classroom1){
    this.id=id; // değişkenlerin karışmaması için burdaki manasında
    this.name=name; // başlarına this ekliyoruz.
    this.surName=surName;
    this.classroom=classroom;
    }
    public Student(int id1, String name1, String surName1) {
        this(id1, name1, "", 0); // this: Class ın içindeyken Classdan
                                                    // bahsettiğinizde kullanılır.
    }
    public Student(int id1){
        this(id1, "", "", 0);



    }


}
