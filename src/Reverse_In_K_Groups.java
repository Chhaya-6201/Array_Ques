/*
Reverse an Array in groups of given size
Last Updated : 13 Apr, 2025
Given an array arr[] and an integer k, the task is to reverse every subarray formed by consecutive K elements.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9], k = 3
Output: 3, 2, 1, 6, 5, 4, 9, 8, 7


Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 5
Output: 5, 4, 3, 2, 1, 8, 7, 6


Input: arr[] = [1, 2, 3, 4, 5, 6], k = 1
Output: 1, 2, 3, 4, 5, 6


Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 10
Output: 8, 7, 6, 5, 4, 3, 2, 1

 */

public class Reverse_In_K_Groups {

    static void reverseSubarray(int[] arr,int k){
        int n=arr.length;
        for (int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
           while(left<right){
              int temp=arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
              left++;
              right--;
           }
        }

    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        int k=4;
        reverseSubarray(arr,k);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}
