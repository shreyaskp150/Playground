import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a[]=new int[n];
      	int b[]=new int[n];
      	int i,f=1;
      	for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      	for(i=0;i<n;i++)
        {
          b[i]=s.nextInt();
        }
      	for(i=0;i<n;i++)
        {
         	if(a[i]<b[i])
            {
             	f=0;
              	break;
            }
        }
      	if(f==1)
          System.out.print("Compatible");
      	else
          System.out.print("Incompatible");
    }
}