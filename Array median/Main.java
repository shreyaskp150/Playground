import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i,j,t;
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
       	if(a[j]>a[j+1])
        {
         	t=a[j];
          	a[j]=a[j+1];
          	a[j+1]=t;
        }
      }
    }
    if(n%2==1)
      System.out.printf("The median of the array is %.2f",(float)a[n/2]);
    else
      System.out.printf("The median of the array is %.2f",(float)a[n/2]);
  }
}