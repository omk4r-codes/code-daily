// in java, functions or methods are only passed by value
// this means that the value of the variable is passed to the function
// and the function cannot change the value of the variable
// this is because the function creates a copy of the variable
// and the copy is passed to the function
// so the function cannot change the value of the original variable

public class Lesson06_Functions {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);
        changeName(name);
        System.out.println(name);

        // this doesn't work as well!!!
        Integer a = 39;
        System.out.println(a);
        chaangeVar(a);
        System.out.println(a);
    }

    public static void changeName(String name) {
        name = "Jane";
    }

    static void chaangeVar(Integer a){
        a = 10;
    }


} 