public class Lesson33_StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        // initially it's a empty string "":
        System.out.println(str.toString().equals(""));
        str.append("Omkar");
        System.out.println(str);

        // why use StringBuilder?
        String st = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            st = st + ch;
            // everytime separate string is created since string is immutable.
        }
        System.out.println(st);


            // how to change value of stringbuilder?
            str.replace(0, str.length(), st);
            System.out.println(str);

        str.replace(0, str.length(), "");
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            str.append(ch);
            // separate string is not created every time
        }

        System.out.println(str);


        // some extra string and builder methods:
        String s = "Omkar Salunke";
        System.out.println(s.indexOf("Sal"));
        System.out.println(str.reverse());

        String totrim = "        Omkar         salunkr           ";
        System.out.println(totrim.trim());
        System.out.println(totrim.strip());
        
        // Demonstrating the differences between trim() and strip()
        System.out.println("\n=== Differences between trim() and strip() ===");
        
        // Test with regular spaces
        String test1 = "   hello world   ";
        System.out.println("Original: '" + test1 + "'");
        System.out.println("trim():   '" + test1.trim() + "'");
        System.out.println("strip():  '" + test1.strip() + "'");
        
        // Test with Unicode whitespace characters
        String test2 = "\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000hello\u2000world\u2000";
        System.out.println("\nUnicode whitespace test:");
        System.out.println("Original: '" + test2 + "'");
        System.out.println("trim():   '" + test2.trim() + "'");
        System.out.println("strip():  '" + test2.strip() + "'");
        
        // Test with mixed whitespace
        String test3 = "\t\n\r hello \t\n\r world \t\n\r";
        System.out.println("\nMixed whitespace test:");
        System.out.println("Original: '" + test3 + "'");
        System.out.println("trim():   '" + test3.trim() + "'");
        System.out.println("strip():  '" + test3.strip() + "'");
        
        // Performance comparison
        System.out.println("\n=== Key Differences ===");
        System.out.println("1. trim() only removes ASCII whitespace (space, tab, newline, carriage return)");
        System.out.println("2. strip() removes ALL Unicode whitespace characters");
        System.out.println("3. strip() was introduced in Java 11");
        System.out.println("4. trim() is older (available since Java 1.0)");
        System.out.println("5. For most common cases, both work the same");
        System.out.println("6. strip() is recommended for modern applications");
    }
}
