public class Frequency_NumArray {
    public static void main(String[] args){

    int[] arr = {7, 3, 0, 9, 1, 4, 8,  5, 6, 9, 3, 7, 0, 1, 5, 2, 8, 4, 6, 1, 0,
                7, 3, 9, 2,  2, 8, 4, 6, 5, 0, 1, 9, 3, 7, 2,
                8, 4, 8, 4, 6, 0, 3, 7, 3, 0,
                1, 9, 2, 5, 8, 7, 2, 8, 4, 6};
     count(arr);
    }

    public static void count(int[] arr){
       int[] num=new int[10];
       for(int i=0;i<arr.length;i++){
           num[arr[i]]+=1;
       }
       for(int freq:num){
           System.out.print(freq+" ");
       }
    }
}
