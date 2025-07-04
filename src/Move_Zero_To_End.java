/*
Move all zeros to end of array

Given an array of integers arr[], the task is to move all the zeros to the end of the array
while maintaining the relative order of all non-zero elements.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: arr[] = [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: arr[] = [0, 0]
Explanation: No change in array as there are all 0s.
 */

/*
[Better Approach] Two Traversals
The idea is to move all the zeros by traversing the array twice.

First Traversal: Shift non-zero elements

Traverse the array and maintain the count of non-zero elements. This count is initialized with 0 and keeps track
of where the next non-zero element should be placed in the array.
If the element is non-zero, place it at arr[count] and increment count by 1.
After traversing all the elements, all non-zero elements will be shifted to the front while maintaining their
original order.
Second Traversal: Fill remaining positions with zeros


After the first traversal, all non-zero elements will be at the start of the array and count will store
the index where the first zero should be placed.
Iterate from count to the end of array and fill all indices with 0.
 */

public class Move_Zero_To_End {

    static void pushZeroesToEnd(int[]  arr){
        int count =0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
            while(count<arr.length)
            {
                arr[count++]=0;
            }
        }

        public static void main(String[] args){
            int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
            pushZeroesToEnd(arr);
            for(int num:arr){
                System.out.print(num+" ");
            }


        }

    }





