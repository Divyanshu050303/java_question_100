package array;

import java.util.Scanner;

public class printindexofthatprticularelment07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the specific value");
        int m=sc.nextInt();
        System.out.println("enter the element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                System.out.println(i);
                break;
            }
        }

    }
}
