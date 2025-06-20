public class Reverse_Array {

    static void reversedArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp;
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        reversedArray(arr);
        for (int num:arr){
            System.out.print(num + " ");
        }

        }
    }

