// ceiling = we want bigger element or equal element to target

public class Lesson19_Ceiling {
    public static void main(String[] args) {
        // int[] arr = {2,3,5,9,14,16,18};
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr, 9));
        System.out.println(ceiling2(arr, 15));
    }

    static int ceiling(int[] arr, int target){
        int low, mid, high;
        int tempAns = -1;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                tempAns = arr[mid];
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return tempAns;
    }

    // or onemore easy approach: just return low when the while loop ends (yes!) 

    static int ceiling2(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low < arr.length ? arr[low]: -1;
    }
}
