public class Lesson35_Classes {
    public static void main(String[] args) {
        Student omkar = new Student();
        System.out.println(omkar);
    }
}

class Student {
    int id;
    String name;
    float marks;

    Student(){
        this.id = 4;
        this.name = "Omkar";
        this.marks = 40.8f;
    }

    @Override
    public String toString(){
        return "id: " + id + ", name: " + name + ", marks: " + marks;
    }
}
