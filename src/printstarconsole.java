import java.util.Scanner;

public class printstarconsole {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                //System.out.print(j);
               // System.out.print("*");
                //System.out.print(i);
                System.out.print(k);
                k++;
            }
            System.out.println(" ");
        }
    }
}
