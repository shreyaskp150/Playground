import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int i,j;
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=n;j++)
	        {
	            if(i%2==1)
	            {
	                if(j==n)
	                {
	                    System.out.printf("%d",i+1);
	                }
	                else
	                    System.out.print(i);
	            }
	            else
	            {
	                if(j==1)
	                {
	                    System.out.printf("%d",i+1);
	                }
	                else
	                    System.out.print(i);
	            }
	        }
	        System.out.println();
	    }
	
	}
}