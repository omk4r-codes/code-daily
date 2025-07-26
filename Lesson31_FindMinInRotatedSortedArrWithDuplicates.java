// just find pivot + 1 element:

public class Lesson31_FindMinInRotatedSortedArrWithDuplicates {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2}; // No duplicates, pivot at index 3
        int[] arr2 = {2, 2, 2, 2, 2, 2, 2}; // All duplicates
        int[] arr3 = {3, 3, 3, 1}; // Duplicates at start, pivot at index 2
        int[] arr4 = {1, 3, 3, 3}; // Duplicates at end, pivot at index -1 since array not rotated
        int[] arr5 = {2, 2, 2, 0, 1}; // Duplicates at start, pivot at index 2
        
        System.out.println("Arr 1: " + findMin(arr1));
        System.out.println("Arr 2: " + findMin(arr2));
        System.out.println("Arr 3: " + findMin(arr3)); 
        System.out.println("Arr 4: " + findMin(arr4)); 
        System.out.println("Arr 5: " + findMin(arr5)); 
    }

    static int findMin(int[] nums) {
        int pivotIndex = findPivot(nums);
        return nums[(pivotIndex + 1) % nums.length];
    }

    static int findPivot(int[] arr){
        int low,high;
        low = 0;
        high = arr.length - 1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(mid<high && arr[mid] > arr[mid+1])
                return mid;
            else if(mid>low && arr[mid] < arr[mid-1])
                return mid-1;
            else if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                if(low<high && arr[low] > arr[low+1])
                    return low;
                low++;
                if(high>low && arr[high] < arr[high-1])
                    return high-1;
                high--;
            }
            else if(arr[mid] > arr[high])
                low = mid + 1;
            else if(arr[low] > arr[mid])
                high = mid - 1;
            else{
                low++;
                high--;
            }
        }
        return -1;
    }
}
