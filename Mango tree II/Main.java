import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int n=s.nextInt();
        if(n<=r || n%r==1 || (n>(r*(c-1)) && n<=(r*c)))
          System.out.print("Yes");
        else
          System.out.print("No");
	}
}