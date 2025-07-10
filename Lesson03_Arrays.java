public class Lesson03_Arrays {
    public static void main(String[] args) {

       // syntax:
       int[] arr = {1,2,3,4,5}; 
       int[] roll = new int[8]; 

       // by default, int array initialized by 0
       for (int i : roll) {
        System.out.print(i + ", ");
       }
       System.out.println();

       roll[0] = 1;
       roll[1] = 1;
       roll[2] = 1;
       roll[3] = 1;
       roll[4] = 1;
       

       for (int i : roll) {
        System.out.print(i + ", ");
       }

       char[] ch = new char[4];
       // no char for default char array
       for (char c : ch) {
        System.out.print(c + ", ");
       }
    }
} 