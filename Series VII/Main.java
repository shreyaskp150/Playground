import java.lang.Math;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i;
      	double c=1.0,d=2.0;
      	System.out.print("1 "+d);
      	for(i=3;i<=n;i++)
        {
       		if(i%2==1)
            {
              c=c*3;
              System.out.print(" "+c);
            }
          	else
            {
              d=d*3;
          	  System.out.print(" "+d);
            }
        }
	}
}