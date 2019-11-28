import java.lang.Math;
import java.util.Scanner;
class Main
{
  	static int findsum(int a[],int n) 
	{ 
    	if(n<=0) 
        	return 0; 
    	return (findsum(a,n-1)+a[n-1]); 
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
      	System.out.print("The sum of the elements in the array is "+findsum(a,n));
    }
}