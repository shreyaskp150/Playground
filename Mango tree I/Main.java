import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int n=s.nextInt();
        if(n<=c || n%c==0 || (n-1)%c==0)
          System.out.print("Yes");
        else
          System.out.print("No");
	}
}