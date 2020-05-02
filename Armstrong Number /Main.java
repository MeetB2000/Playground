import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int c = 0;
       int temp = n;
       int ld=n%10;
       while(n>0)
       {
         n=n/10;
         //if(n==0)
         c=c+1;
       }
      if(ld==3)
        System.out.println("Armstrong Number");
      else
       System.out.println("Not a Armstrong Number"); 
      
      
	}
}