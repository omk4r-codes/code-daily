public class Lesson09_Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        // int x = 349;     
        // the shadowing doesn't begin when you declare a variable, it begins when you initialize it.
        int x;      // declaring. Will give error below if not initialized, since they will try to use this now.  
        x = 987;
        System.out.println(x);
        fun();      // will take the static int x
        fun2(x);    // will take the above newly initialized value (x got shadowed)
    }

    static void fun()
    {
        System.out.println(x);
    }

    static void fun2(int x)
    {
        System.out.println(x);
    }
} 