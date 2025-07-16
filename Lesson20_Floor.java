// floor = we want smaller element or equal element to target

public class Lesson20_Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(floor(arr, 17));
        System.out.println(floor2(arr, 17));
    }

    static int floor(int[] arr, int target){
        int low, mid, high;
        int tempAns = -1;
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target)
                return arr[mid];
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
                tempAns = arr[mid];
            }
        }
        return tempAns;
    }

    // or else just return high where the loop exits!
    static int floor2(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) /2;
            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return arr[high];
    }
}
