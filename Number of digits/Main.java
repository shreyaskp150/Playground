import java.util.Scanner;
class Main
{
  	static int sum(int n)
    {
     	if(n<10)
          return 1;
      	else
          return 1+sum(n/10);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	System.out.print("The number of digits in "+n+" is "+sum(n));
    }
}