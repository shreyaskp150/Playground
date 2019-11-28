import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int x=sc.nextInt();
      	int a=sc.nextInt();
        int b=sc.nextInt();
      	System.out.print("The profit obtained is Rs."+((a*x)-(x*b)-100));
    }
}