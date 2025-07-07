public class Armstrong {
    public static void main(String[] args) {
        // int num = 153;
        // System.out.println(armstrong(num));
        printAllArmstrong(1000);
    }

    static boolean armstrong(int n){
        int cpy = n;
        int size = String.valueOf(n).length();
        int res = 0;
        while (n > 0) {
            int ld = n % 10;
            ld = (int) Math.pow(ld, size);
            res = res + ld;
            n = n / 10;
        }

        return cpy == res;
    }

    static void printAllArmstrong(int n){

        for(int i = 0; i < n; i++){
            if(armstrong(i))
                System.out.print(i + ", ");
        }
    }
}
