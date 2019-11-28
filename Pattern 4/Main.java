import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,j,k;
      	for(i=1;i<=n;i++)
        {
          for(j=n-i+1;j<=n;j++)
          {
			System.out.print(j);
          }
          for(k=1;k<=n-i;k++)
            System.out.print(n);
          System.out.println();
        }
	}
}