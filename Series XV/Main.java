import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a=3,b=8,c,i;
      	System.out.print(a+" "+b);
      	for(i=3;i<=n;i++)
        {
          c=a+b+i-1;
          System.out.print(" "+c);
          a=b;
          b=c;
        }
	}
}