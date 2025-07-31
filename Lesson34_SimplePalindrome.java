public class Lesson34_SimplePalindrome {
    static int o;
    static String s;
    static boolean bool;
    public static void main(String[] args) {
        System.out.println(o);
        System.out.println(s);
        System.out.println(bool);

        String str = "cba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int low = 0;
        int high = str.length() - 1;
        while (low <= high) {
            if(str.charAt(low) == str.charAt(high)){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
