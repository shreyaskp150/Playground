import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	int b=sc.nextInt();
      	System.out.print("The number of students in each team is "+(a/b));
      	System.out.print(" and left out is "+(a%b));
    }
}