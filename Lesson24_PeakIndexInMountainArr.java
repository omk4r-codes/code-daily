// https://leetcode.com/problems/peak-index-in-a-mountain-array

public class Lesson24_PeakIndexInMountainArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,49,35,32,20,15,10,9,8,1};
        System.out.println(arr[findPeakIndex(arr)]);
    }

    static int findPeakIndex(int[] arr){
        int low, mid, high;
        low = 0;
        high = arr.length - 1;
        while (low != high) {
            mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid+1]){
                // we are in the decreasing part of the array
                // mid might be ans; but still need to check in left
                high = mid;
            }
            else if (arr[mid] < arr[mid+1]) {
                // we are in increasing part of the array
                // mid isn't the answer, need to check in right.
                low = mid + 1;
            }
        }
        return low;
    }
}
