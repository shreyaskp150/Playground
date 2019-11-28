import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,j;
      	for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
          {
            if(j%2==1)
              System.out.print("1 ");
            else
              System.out.print("0 ");
          }
         System.out.println();
        }
	}
}