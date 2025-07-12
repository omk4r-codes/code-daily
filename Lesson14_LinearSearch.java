import java.util.Arrays;

public class Lesson14_LinearSearch {
    public static void main(String[] args) {
        // int[] arr = {2,3,5,6,1,8,9};
        // System.out.println(linearSearch(arr, 8));
        // String name = "0mk4r#shwar";
        // char target = '#';
        // System.out.println(search(name, target));

        // System.out.println(searchInRange(arr, -1, 9, 89));
        // System.out.println(min(arr));

        int[][] arr2 = {
            {1,2,3,4},
            {1,4},
            {7,2,9}
        };

        System.out.println(Arrays.toString(searchIn2dArr(arr2, 9)));

    }

    static int linearSearch(int[] arr, int val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }

    // search in string
    static boolean search(String str, char target){
        // for(char c : str){

        // }    // cant do stuff like this with strings

        for(int i = 0; i < str.length(); i++){
            // Using == for primitive char comparison (correct)
            if(str.charAt(i) == target){
                return true;
            }
            
            // Alternative using .equals() with Character object:
            // if(Character.valueOf(str.charAt(i)).equals(Character.valueOf(target))){
            //     return true;
            // }
        }

        // if you want to use foreach:
        for (char ch : str.toCharArray()) {
            if(ch == target)
                return true;
        }

        return false;
    }

    // search in range:
    static int searchInRange(int[] arr, int startIndex, int endIndex, int target){
        if(endIndex >= arr.length)
            endIndex = arr.length - 1;
        if(startIndex < 0)
            startIndex = 0;
        for(int i = startIndex; i <= endIndex; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }

    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if(ele < min){
                min = ele;
            }
        }
        return min;
    }

    static int[] searchIn2dArr(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
