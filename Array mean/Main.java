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
      	int sum=0;
      	for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
      	System.out.printf("The mean of the array is %.2f",(float)sum/n);
    }
}