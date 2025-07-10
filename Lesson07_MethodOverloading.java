public class Lesson07_MethodOverloading {
    public static void main(String[] args) {
        sum(2,1);       // runs 1st fn
        sum(2,1, 5);       // runs 2nd fn
    }

    // 1.
    static int sum(int n1, int n2){
        System.out.println("1st fn");
        return n1 + n2;
    }

    // 2.
    static int sum(int ...n){
        System.out.println("2nd fn");
        int res = 0;
        for (int i : n) {
            res = res + i;
        }
        return res;
    }
} 