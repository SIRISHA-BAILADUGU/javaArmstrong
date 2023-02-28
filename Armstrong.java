import java.util.*;
class Armstrong
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int check=0;
        while(check!=1)
    {
        int n=sc.nextInt();
       int count=0,sum=0,arm=n;
        while(n>0)
        {
       
        count+=1;
        n/=10;
        }
        n=arm;
        while(n>0)
        {
        
            sum+=Math.pow(n%10,count);
            n/=10;
        }
        if(sum==arm)
        {
            System.out.println("Armstrong");
            check=1;
        }

    }   

 }
}
