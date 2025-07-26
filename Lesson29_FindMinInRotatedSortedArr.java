public class Lesson29_FindMinInRotatedSortedArr {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        // find pivot+1 element
        int pivotIndex = findPivot(nums);
        return nums[(pivotIndex + 1) % len];
        
    }

    static int findPivot(int[] nums){
        int low, mid, high;
        low = 0;
        high = nums.length - 1;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(mid < high && nums[mid] > nums[mid + 1])
                return mid;
            else if(mid>low && nums[mid] < nums[mid-1])
                return mid-1;
            else if(nums[low] > nums[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;  // arr is not rotated 
    }
}
