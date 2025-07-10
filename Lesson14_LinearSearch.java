public class Lesson14_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,1,8,9};
        System.out.println(linearSearch(arr, 8));
    }

    static int linearSearch(int[] arr, int val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }
}
