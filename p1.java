import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
    int x ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        x=s.nextInt();
        s.close();
    if(x>0)
    {
        System.out.println(+x+ ":The number is positive");
    }
    else if(x==0)
            {
                System.out.println(+x+ ":The number is zero");
            }
     else
            {
               System.out.println(+x+ ":The number is negative");
            }
    }
}
