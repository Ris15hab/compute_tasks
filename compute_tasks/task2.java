import java.util.*;
public class task2
{
    public static void main(String Args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=s.nextLine();
        System.out.println("Enter the first string:");
        String str2=s.nextLine();
        int temp=1;char ch,ch1;
        for(int i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            for(int j=0;j<str2.length();j++)
            {
                ch1=str2.charAt(j);
                if(ch1==ch)
                {
                    str2=(str2.substring(0,j)).concat(str2.substring(j+1));
                    break;
                }
            }
        }
        System.out.println("Extra character entered:"+str2);
    }
}