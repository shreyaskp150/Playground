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
      	int max=a[0],min=a[0];
      	for(i=0;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
        }
      	for(i=0;i<n;i++)
        {
          if(min>a[i])
            min=a[i];
        }
      	System.out.print("The range of the array is "+(max-min));
    }
}