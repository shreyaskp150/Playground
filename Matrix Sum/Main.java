import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int r=s.nextInt();
      	int c=s.nextInt();
      	int i,j;
      	int a[][]=new int[r][c];
      	for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            a[i][j]=s.nextInt();
          }
        }
      	int sum=0;
      	for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            sum+=a[i][j];
          }
        }
      	System.out.print(sum);
	}
}