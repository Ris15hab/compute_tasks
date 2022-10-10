import java.util.*;
public class task1
{
    public static void main(String Args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number to be divided:");
        int a=s.nextInt();
        System.out.println("Enter the divisor:");
        int b=s.nextInt();
        int rem=a%b;
        if(rem<=(b/2))
            System.out.println("Minimum moves="+rem);
        else
            System.out.println("Minimum moves="+(b-rem));
    }
}