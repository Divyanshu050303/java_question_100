package array;

import java.util.Scanner;

public class copyonearraytoanotherarray09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the element");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        System.out.println("actual array");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("copying array");
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }

    }
}
