import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a[]=new int[n];
      	int i;
      	for(i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      	int ele=s.nextInt();
      	for(i=0;i<n;i++)
        {
          if(ele==a[i])
          {
           	System.out.print(a[i]+" is present in the array");
			System.exit(0);
          }
        }
      	System.out.print(ele+" is not present in the array");
    }
}