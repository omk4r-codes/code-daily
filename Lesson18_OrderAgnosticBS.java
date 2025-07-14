public class Lesson18_OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBS(arr, 0));
        System.out.println(orderAgnosticBS2(arr, 0));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        if(arr[0] < arr[arr.length - 1]){
            // normal
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if(arr[mid] == target)  
                    return mid;
                else if(arr[mid] < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        else{
            // reversed
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if(arr[mid] == target)  
                    return mid;
                else if(arr[mid] < target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    // or maybe a clean-looking veraion:
    static int orderAgnosticBS2(int[] arr, int target){
        int low, mid, high;
        low = 0;
        high = arr.length - 1;
        boolean isAsc = arr[low] < arr[high];

        while (low <= high) {
            mid = low + (high - low) / 2;
            if(arr[mid] == target)
                return mid;
            
            if(isAsc){
                if(arr[mid] < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            else{
                if(arr[mid] < target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
