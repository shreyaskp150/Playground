import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i;
      	for(i=1;i<=n;i++)
        {
          System.out.print((i*i)+" ");
        }
	}
}