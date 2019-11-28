import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,a=9,b=11,c;
      	System.out.print(a+" "+b);
      	for(i=3;i<=n;i++)
        {
       		c=a+b;
            System.out.print(" "+c);
          	a=b;
          	b=c;
        }
	}
}