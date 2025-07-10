import java.util.Arrays;

public class Lesson08_VariableArguments {
    public static void main(String[] args) {
        int res = sum(1,2,3,4,5,6,6);
        System.out.println(res);
    }
    static int sum(int a, int b, int ...num){
        System.out.println(Arrays.toString(num));
        int res = a + b;
        for (int i : num) {
            res = res + i;
        }
        return res;
    }
} 