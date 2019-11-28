import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a=6,i;
      	System.out.print(a);
      	for(i=1;i<n;i++)
        {
          a+=(5*i);
          System.out.print(" "+a);
        }
	}
}