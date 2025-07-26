// find pivot, then binary search on both sides.

public class Lesson28_FindInRotatedSortedArr {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,1};
        System.out.println(search(arr, 4));
    }

    static int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 1){
            if(nums[0] == target)
                return 0;
            else
                return -1;
        }
        
        int pivot = findPivot(nums);
        int first = bs(nums, target, 0, pivot);
        if(first != -1)
            return first;
        else
            return bs(nums, target, pivot + 1, nums.length - 1); 
    }

    static int findPivot(int[] nums){
        int len = nums.length;

        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(mid < nums.length -1 && nums[mid] > nums[mid+1])
                return mid;
            else if(mid > 0 && nums[mid] <nums[mid-1])
                return mid-1;
            else if(nums[mid] > nums[high])
                low = mid + 1;
            else if(nums[mid] < nums[low])
                high = mid - 1;
            else
                break;    
        }
        return -1;  // pivot not found, array is sorted.
    }

    static int bs(int [] nums, int target, int low, int high){
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
