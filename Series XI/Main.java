import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i;
        double d=95.0,e=20.5;
      	System.out.print(d);
      	for(i=1;i<=n-1;i++)
        {
       		d=d+e;
            System.out.print(" "+d);
          	e=e+2;
        }
	}
}