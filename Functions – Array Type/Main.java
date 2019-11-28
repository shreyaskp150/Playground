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
      	int e=0,o=0;
      	for(i=0;i<n;i++)
        {
          if(a[i]%2==0)
            e++;
          else
            o++;
        }
      	if(e==n)
      		System.out.print("The array is Even");
      	else if(o==n)
      		System.out.print("The array is Odd");
      	else
          	System.out.print("The array is Mixed");
    }
}