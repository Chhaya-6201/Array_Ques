/*
Maximum consecutive one’s (or zeros) in a binary array
Last Updated : 28 Mar, 2025
Given an array arr[] consisting of only 0’s and 1’s, the task is to find the count of a maximum number of
consecutive 1’s or 0’s present in the array.

Examples :

Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 8-11.


Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
Output: 2
Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.


Input: arr[] = {0, 0, 0, 0}
Output: 4
Explanation: The maximum number of consecutive 0’s in the array is 4.


 */

/*
Steps to implement the above idea:

Initialize maxCount and count to 0 and track the previous element.
Traverse the list, increment count if the current element matches previous, else update maxCount and reset count.
Update previous to the current element in each iteration.
Return the maximum of maxCount and count at the end.
 */

public class Max_Consecutive {

    static int maxConsecutiveCount(int[] arr){
        int maxCount=0;
        int count=1;

        if(arr.length==0){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else {
                  maxCount=Math.max(maxCount,count);
                  count=1;
            }
        }
        return Math.max(maxCount,count);
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,0};
        System.out.println(maxConsecutiveCount(arr));
    }


}
