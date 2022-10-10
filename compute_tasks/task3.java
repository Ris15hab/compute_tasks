import java.util.*;
public class task3
{
    public static void main(String Args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=s.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        int i,j,count=1;
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            brr[i]=arr[i];
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(brr[i]>brr[j])
                {
                    int temp=brr[i];
                    brr[i]=brr[j];
                    brr[j]=temp;
                }
            }
        }
        for(i=0;i<n-1;i++)
        {
            if(arr[i]==brr[i])
            {
                int temp=brr[i];
                brr[i]=brr[i+1];
                brr[i+1]=temp;
            }
            if(arr[i]==brr[i])
            count=0;
        }
        if(count==0||n==1)
        System.out.println("-1");
        else{
            System.out.println("Lexicographically smallest permutation:");
            for(i=0;i<n;i++)
            System.out.print(brr[i]+" ");
        }
    }
}