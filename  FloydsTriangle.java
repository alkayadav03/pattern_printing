import java.util.Scanner;
public class FloydsTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no:");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
             System.out.print(a+" ");
             if(a<10) System.out.print(" ");
            a++;
        }
           System.out.println();
    }
}
}