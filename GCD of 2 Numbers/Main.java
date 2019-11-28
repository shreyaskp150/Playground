import java.util.Scanner;
class Main
{
  	static int gcd(int a,int b)
    {
     	if (b!=0)
       		return gcd(b,a%b);
    	else 
       		return a;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n1=s.nextInt();
      	int n2=s.nextInt();
      	System.out.print("G.C.D of "+n1+" and "+n2+" is "+gcd(n1,n2));
    }
}