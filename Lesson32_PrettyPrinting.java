public class Lesson32_PrettyPrinting {
    public static void main(String[] args) {
        System.out.printf("Helo I am %s and i am %d yrs old\n", "Omkar", 21);

        float num = 8.8765432f;
        // format till only 2 decimal digits:
        System.out.printf("The formatted num is: %.2f\n", num);

        char ch = 'a';
        System.out.println(++ch);   // lol this works!
    }
}
