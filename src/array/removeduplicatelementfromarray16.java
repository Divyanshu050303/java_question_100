package array;

import java.util.Arrays;

public class removeduplicatelementfromarray16 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,9};
        Arrays.sort(arr);
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]!=arr[i+1]){
               System.out.println(arr[i]);
           }
       }
    }
}
