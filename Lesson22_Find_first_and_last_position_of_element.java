// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=problem-list-v2&envId=binary-search

import java.util.Arrays;

public class Lesson22_Find_first_and_last_position_of_element {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,3,3,4,4,4,5,5,5,5,5,5,6};
        System.out.println(Arrays.toString(searchRange(arr, 5)));
    }

    static int[] searchRange(int[] nums, int target) {
        /*
         logic:
         find ceiling
         find floor
         */   
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        int[] ans = {first, last};
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    high = mid - 1;
                }
                else
                    low = mid + 1;
            }
            else if(arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return ans;
    }
}
