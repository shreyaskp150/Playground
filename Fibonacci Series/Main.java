import java.util.Scanner;
class Main
{
  	static int fibnocii(int n)
    {
      	if(n==0)
      		return 0;
   		else if(n==1)
      		return 1;
   		else
      		return((fibnocii(n-1)+fibnocii(n-2)));
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	System.out.print("The term "+n+" in the fibonacci series is "+fibnocii(n-1));
    }
}