import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,j;
      	for(i=1;i<(2*n);i+=2)
		{
			for(j=i;j<(2*n);j+=2)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
    }
}