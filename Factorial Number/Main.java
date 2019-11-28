import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int f=1,i,g=0;
      	for(i=1;i<=n/2;i++)
        {
         	f=f*i;
          	if(f==n)
            {
              g=1;
              break;
            }
        }
      	if(g==1)
      		System.out.print("Yes");
      	else
          	System.out.print("No");
    }
}