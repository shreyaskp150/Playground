import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,j,k=1;
      	for(i=1;i<=n;i++)
        {
          for(j=1;j<=(2*n)-k;j++)
           	System.out.print(j+" ");
          System.out.println();
          k+=2;
        }
	}
}