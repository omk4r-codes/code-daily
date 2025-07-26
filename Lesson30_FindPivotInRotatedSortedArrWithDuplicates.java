public class Lesson30_FindPivotInRotatedSortedArrWithDuplicates {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2}; // No duplicates, pivot at index 3
        int[] arr2 = {2, 2, 2, 2, 2, 2, 2}; // All duplicates
        int[] arr3 = {3, 3, 3, 1}; // Duplicates at start, pivot at index 2
        int[] arr4 = {1, 3, 3, 3}; // Duplicates at end, pivot at index -1 since array not rotated
        int[] arr5 = {2, 2, 2, 0, 1}; // Duplicates at start, pivot at index 2
        
        System.out.println("Arr 1: " + findPivot(arr1)); // Expected: 3
        System.out.println("Arr 2: " + findPivot(arr2)); // Expected: -1 or any valid index
        System.out.println("Arr 3: " + findPivot(arr3)); // Expected: 2
        System.out.println("Arr 4: " + findPivot(arr4)); // Expected: 2
        System.out.println("Arr 5: " + findPivot(arr5)); // Expected: 2
    }

    static int findPivot(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if(mid < high && arr[mid] > arr[mid+1])
                return mid;
            else if(mid > low && arr[mid] < arr[mid-1])
                return mid - 1;
            // Handle duplicates
            else if(arr[mid] == arr[low] && arr[mid] == arr[high]){
                // Check if low is the pivot
                if(low < high && arr[low] > arr[low+1]){
                    return low;
                }
                low++;
                // Check if high-1 is the pivot
                if(high > low && arr[high] < arr[high-1]){
                    return high-1;
                }
                high--;
            }
            // Standard binary search logic
            else if(arr[low] > arr[mid])
                high = mid - 1;
            else if(arr[high] < arr[mid])
                low = mid + 1;
            else {
                // If we can't determine direction, move both pointers
                low++;
                high--;
            }
        }
        return -1;
    }
}
