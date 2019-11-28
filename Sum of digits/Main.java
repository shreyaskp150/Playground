import java.util.Scanner;
class Main
{
  	static int sum(int n)
    {
     	if(n<10)
          return n;
      	else
          return (n%10)+sum(n/10);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	System.out.print("The sum of digits in "+n+" is "+sum(n));
    }
}