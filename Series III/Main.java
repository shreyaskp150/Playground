import java.lang.Math;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,a=3,b=1;
      	for(i=1;i<=n;i++)
        {
          b=b*a;
          System.out.print(b+" ");
        }
	}
}