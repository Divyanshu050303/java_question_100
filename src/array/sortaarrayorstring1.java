package array;

import java.util.Scanner;

public class sortaarrayorstring1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++) {
                if (a[i] > a[j]) {
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        System.out.println("sort the Integer array");
        for (int ai:a) {
            System.out.println(ai);
        }
    }
}
