public class Lesson15_CountDigits {
    public static void main(String[] args) {
        int num = 98765874;
        System.out.println(countDigits(num));
    }

    static int countDigits(int num){
        if(num < 0)
            num = num * -1;
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num = num/10;
        }
        return cnt;
    }

    static int countDigits2(int num){
        if(num < 0)
            num = num * -1;
        return (int) Math.log10(num)+1;
    }
}
