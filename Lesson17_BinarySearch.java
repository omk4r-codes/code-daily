// only works in sorted array.

public class Lesson17_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,12,67,88,89,90,95,99,120,140,150};
        System.out.println(binarySearch(arr, 90));
        System.out.println(arr.length);
    }

    static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
