import java.util.Scanner;
public class alphabetSquare_01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of rows");
        int r=sc.nextInt();
         System.out.print("enter the no. of cols");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
/*enter the no. of rows5
enter the no. of cols5
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 
*/