// https://leetcode.com/problems/find-peak-element

/*
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index. 
 * If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always 
 * considered to be strictly greater than a neighbor that is outside the array.
 * You must write an algorithm that runs in O(log n) time.
 */

public class Lesson25_FindPeakElement {

    // the line: 
    // "If the array contains multiple peaks, return the index to any of the peaks"
    // is the key to solve this. We can return any peaks, just return the greatest element,
    // like in the last question!
    // so even if the array is not sorted, we can apply binary search sort of thing here
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
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
