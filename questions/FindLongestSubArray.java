package ds.interesting.questions;

/*
Question : Find the longest sub-array from an integer array which will be equal to the a value 'n' (input). Time complexity : O(n) + c
Example  : {1, 2, 3, 4, 5, 0, 0, 0, 7}  <Input value : 15>
Output   :  ^                    ^ //The longest sub array which would add up to the value 15
 */
public class FindLongestSubArray {

    static int findSum(int l, int r, int arr[]) {
        int sum = 0;
        do {
            sum += arr[l];
            l++;
        } while (l <= r);
        return sum;
    }

    static void findLongestSubArray(int arr[], int val) {
        int left = 0, right = 0, length = 0, i, j, sum;
        int actualLeft = -1, actualRight = -1;
        for (i = 0; i < arr.length; i++) {
            sum = findSum(left, right, arr);
            if (sum < val) {
                right++;
            } else if (sum > val) {
                left++;
            } else {
                right++;
                if (length < (right - left)) {
                    actualLeft = left;
                    actualRight = right;
                    length = right - left;
                }
            }
        }
        System.out.println("The indices are : [" + actualLeft + ", " + actualRight + "]");
        if (actualLeft != -1 && actualRight != -1) {
            for (i = actualLeft; i < actualRight; i++) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 0, 0, 0, 0, 7};
        int expectedValue = 15;
        findLongestSubArray(arr, expectedValue);
    }
}
