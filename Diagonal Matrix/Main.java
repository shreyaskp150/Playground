import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int r=s.nextInt();
      	int i,j,f=1,g=0;
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
            if(i<j || i>j)
            {
            	if(a[i][j]!=0)
                {
                 	System.out.print("no");
                  	System.exit(0);
                }
            }
          }
        }
      	for(i=0;i<r;i++)
        {
          for(j=0;j<r;j++)
          {
            if(i==j && a[i][j]!=0)
            {	
              	g=1;
            	break;
            }
          }
        }
      	if(f==1 && g==1)
        	System.out.print("yes");
      	else
          System.out.print("no");
	}
}