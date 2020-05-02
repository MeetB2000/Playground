import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ld=n%10;
        int fd=n/100;
        int x=(n/10);
        int md=x%10;
        int sum=0;
        int fact1 = 1,fact2=1,fact3=1;
        for(int i = 1; i<=fd;i++)
        {
          fact1=fact1*i;
        }
        for(int i = 1; i<=md;i++)
        {
          fact2=fact2*i;
        }
        for(int i = 1; i<=ld;i++)
        {
          fact3=fact3*i;
        }
       // System.out.println(fact2);
        sum=fact1+fact2+fact3;
        if(n==sum)
          System.out.println("Yes");
        else
          System.out.println("No");
	}
}