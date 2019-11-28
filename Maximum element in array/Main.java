import java.lang.Math;
import java.util.Scanner;
class Main
{
  	static int findMax(int a[],int n) 
	{ 
    	if(n==1) 
        	return a[0]; 
    	return Math.max(a[n-1],findMax(a,n-1)); 
	} 
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
      	System.out.print("Maximum element in the array is "+findMax(a,n));
    }
}