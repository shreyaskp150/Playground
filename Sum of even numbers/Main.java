import java.lang.Math;
import java.util.Scanner;
class Main
{
  	static int findsum(int a[],int i,int sum) 
	{ 
    	if(i<0) 
        	return sum; 
    	if(a[i]%2==0)
        {  
        	sum+=a[i]; 
    	}
    	return findsum(a,i - 1,sum);
	} 
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a[]=new int[n];
      	int i,sum=0;
      	for(i=0;i<n;i++)
        {
         	a[i]=s.nextInt(); 
        }
      	System.out.print("Sum of even numbers "+findsum(a,n-1,sum));
    }
}