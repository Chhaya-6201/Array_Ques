/*
Remove All Occurrences of an Element in an Array

Input: arr[] = [3, 2, 2, 3], ele = 3
Output: 2
Explanation: The answer is 2 because there are 2 elements which are not equal to 3 and arr[] will be modified
such that the first 2 elements contain the elements which are not equal to 3 and remaining elements can contain
any element. So, modified arr[] = [2, 2, _, _]

Input: arr[] = [0, 1, 3, 0, 2, 2, 4, 2], ele = 2
Output: 5
Explanation: The answer is 5 because there are 5 elements which are not equal to 2 and arr[] will be modified
such that the first 5 elements contain the elements which are not equal to 2 and remaining elements can
contain any element. So, modified arr[] = [0, 1, 3, 0, 4, _, _, _]
 */

/*
Step-by-step algorithm:

Initialize k to 0. This will track the count of the elements not equal to ele.
Iterate over each element in the array using the loop with the index i.
If arr[i] is not equal to the ele, set arr[k] = arr[i] and increment k.
Return k.
 */

public class Remove_Element {
    static int removeElement(int[] arr,int element){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=element){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int element=4;
        int ans=removeElement(arr,element);
        System.out.println(ans);
    }
   }
