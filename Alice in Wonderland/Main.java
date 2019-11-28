import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int x=sc.nextInt();
      	int a=x%10;
        int b=x/10;
      	System.out.print("Alice must go in path-"+(a+b));
    }
}