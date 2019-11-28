import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a[]=new int[n];
      	int b[]=new int[n];
      	int i;
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
          if(a[i]!=b[i])
          {
           	System.out.print("No");
            System.exit(0);
          }
        }
      	System.out.print("Yes");
    }
}