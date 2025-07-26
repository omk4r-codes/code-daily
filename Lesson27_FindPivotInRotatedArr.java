public class Lesson27_FindPivotInRotatedArr {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,1};
        System.out.println(findPivotIndex(arr));
    }

    static int findPivotIndex(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(mid<high && arr[mid] > arr[mid+1])
                return mid;
            else if(mid>low && arr[mid] < arr[mid-1])
                return mid - 1;
            else if(arr[low] > arr[mid])
                high = mid - 1;
            else if(arr[high] < arr[mid])
                low = mid + 1;
            else
                break;
        }
        return -1;  // if pivot doesn't exist (arr is not rotated)
    }
}