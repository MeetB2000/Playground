import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num=1;
        while(n>0 && num<=n)
        {
          if(n%num==0)
          {
            System.out.println(num);
          }
          num=num+1;
        }
	}
}