import java.util.Arrays;
import java.util.Scanner;

public class Lesson04_TwoDArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        // we can also declare like this since individual array size may vary:
        // int[][] arr = new int[3][];

        // also like this:
        int[][] arr2 = {
            {1,2,3,4},
            {1,4},
            {1,2,3}
        };

        // printing
        for (int[] it : arr2) {
            System.out.print(Arrays.toString(it) + " ");
        }
        System.out.println();

        for(int i = 0; i < arr2.length; i++){
            for (int it : arr2[i]) {
                System.out.print(it + ", ");
            }
            System.out.println();
        }

        // input:
        int[][] arr3 = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print("enter element " + i + ", " + j + " : ");
                arr3[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + ", ");
            }
            System.out.println();
        }

        sc.close();
    }
} 