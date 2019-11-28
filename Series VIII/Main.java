import java.lang.Math;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,d=4;
      	System.out.print(d);
      	for(i=1;i<=n-1;i++)
        {
       		d=d+(i*i);
            System.out.print(" "+d);
        }
	}
}