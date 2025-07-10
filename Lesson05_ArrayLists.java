import java.util.ArrayList;
import java.util.Scanner;


// slower than array

public class Lesson05_ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // or: 
        ArrayList<Integer> arr = new ArrayList<>();

        // we can give initial capacity in the brackets:
        ArrayList <Integer> arr2 = new ArrayList<>(5);

        // or you can just skip the type (not a good practice):
        ArrayList arr4 = new ArrayList();


        // addition:
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(8);

        // print / access index:
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
            // note that we use .size() in arrayList and length in arrays.
            // note that we use arr.get(i) to access the element by index; arr[i] doesn't work here!
        }
        
        for (int it : arr) {
            System.out.println(it);
        }


        // arraylist of arraylists:
        ArrayList<ArrayList<Integer>> arr5 = new ArrayList<>();
        // at this moment, everything is null in arr5:
        System.out.println(arr5);       // --> []
        // we have to initialize arraylists in it:
        for(int i = 0; i < 3; i++){
            arr5.add(new ArrayList<>());
        }
        // now 3 arraylists have been added to the arr5:
        System.out.println(arr5);       // --> [[], [], []]

        // input :
        for(int i = 0; i < arr5.size(); i++){
            for(int j = 0; j < 3; j++){
                arr5.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr5);
    }
} 