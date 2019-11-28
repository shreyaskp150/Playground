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
      	for(i=0;i<c;i++)
        {
          int max=a[0][i];
          for(j=0;j<r;j++)
          {
            
            if(max<a[j][i])
            	max=a[j][i];
          }
          System.out.println(max);
        }
	}
}