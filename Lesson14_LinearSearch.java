public class Lesson14_LinearSearch {
    public static void main(String[] args) {
        // int[] arr = {2,3,5,6,1,8,9};
        // System.out.println(linearSearch(arr, 8));
        String name = "0mk4r#shwar";
        char target = '#';
        System.out.println(search(name, target));

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
}
