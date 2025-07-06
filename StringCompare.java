public class StringCompare {
    public static void main(String[] args) {
        String str1 = new String("Kunal");
        String str2 = new String("Kunal");
        // if (str1 == str2) {      // this is foul in Java, it compares objects, not strings! Use:
        if(str1.equals(str2)){
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
