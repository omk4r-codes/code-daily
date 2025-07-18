// infinite array just means we can't use length fn!

public class Lesson23_Find_ele_in_an_infinite_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17};

    }

    static int bsInInfinityArr(int [] arr, int target){
        int low, high, mid;
        low = 0;
        high = 1;
        // find the window:
        while (target > arr[high]) {
            low = high;
            high = high * 2;
        }

        // apply bs over that window
        while (low <= high) {
            mid = low + (high - low ) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
