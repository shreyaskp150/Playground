import java.lang.Math;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,a=11,c;
      	for(i=0;i<=n-1;i++)
        {
          c=a*a;
          a=a+4;
          System.out.print(c+" ");
        }
	}
}