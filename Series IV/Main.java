import java.lang.Math;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i;
      	double b=0.5,c;
      	System.out.print(b);
      	for(i=0;i<=n-2;i++)
        {
          c=Math.pow(3,i);
          b=b+c;
          System.out.printf(" "+b);
        }
	}
}