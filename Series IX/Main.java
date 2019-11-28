import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,d=2;
      	System.out.print(d);
      	for(i=1;i<=n-1;i++)
        {
       		d=d+(13*i);
            System.out.print(" "+d);
        }
	}
}