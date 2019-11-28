import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int r=s.nextInt();
      	int i,j;
      	int a[][]=new int[r][r];
      	for(i=0;i<r;i++)
        {
          for(j=0;j<r;j++)
          {
            a[i][j]=s.nextInt();
          }
        }
      	for(i=0;i<r;i++)
        {
          for(j=0;j<r;j++)
          {
            if(i>j)
            {
            	if(a[i][j]!=0)
                {
                 	System.out.print("no");
                  	System.exit(0);
                }
            }
          }
        }
        System.out.print("yes");
	}
}