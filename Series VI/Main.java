import java.lang.Math;
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,c;
      	for(i=1;i<=n;i++)
        {
       		if(i%2==1)
              c=(i*i)-1;
          	else
              c=(i*i)-2;
          System.out.print(c+" ");
        }
	}
}