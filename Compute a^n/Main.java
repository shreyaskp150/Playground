import java.util.Scanner;
class Main
{
  	static int powr(int a,int n)
    {
     	if(n==1)
          return a;
      	else
          return a*powr(a,n-1);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int a=s.nextInt();
      	int n=s.nextInt();
      	System.out.print("The value of "+a+" power "+n+" is "+powr(a,n));
    }
}