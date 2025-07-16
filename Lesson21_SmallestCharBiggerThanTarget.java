// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=problem-list-v2&envId=binary-search

public class Lesson21_SmallestCharBiggerThanTarget {
    public static void main(String[] args) {
        char [] letters = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int low, mid, high;
        low = 0;
        high = letters.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if(letters[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return letters[low % letters.length];
    }
}
