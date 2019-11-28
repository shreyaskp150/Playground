import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	float s,d,t;
      	s=sc.nextFloat();
      	d=sc.nextFloat();
      	t=sc.nextFloat();
      	if(s/3600>=d/t)
          	System.out.print("Yes");
      	else
          	System.out.print("No");
	}
}