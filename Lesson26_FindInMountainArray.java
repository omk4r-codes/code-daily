// just find the peak index in the array, then find in the first half (binary search), 
// if not found find in the 2nd half

public class Lesson26_FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,7,5,4,3,2,1};
        System.out.println(findInBitonicArray(arr, 3));
    }

    static int findInBitonicArray(int[] arr, int target){
        int low = 0;
        int high = findPeakIndex(arr);
        int search = bs(arr, target, low, high, true);
        if(search != -1)
            return search;
        else
            return bs(arr, target, high + 1, arr.length - 1, false);
    }

    static int bs(int[] arr, int target, int low, int high, boolean isAsc){
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target)
                return mid;
            else if (isAsc) {
                if (arr[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else{
                if (arr[mid] > target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    static int findPeakIndex(int[] arr){
        int low, mid, high;
        low = 0;
        high = arr.length - 1;
        while (low != high) {
            mid = low + (high - low) / 2; 
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }
            else if(arr[mid] < arr[mid+1])
                low = mid + 1;
        }
        return low;
    }
}
