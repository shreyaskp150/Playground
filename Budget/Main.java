import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	int br,vs,as,a,l;
      	br=sc.nextInt();
      	vs=sc.nextInt();
      	as=sc.nextInt();
      	a=sc.nextInt();
      	l=sc.nextInt();
      	double c=(br*350.34)+(vs*230.9)+(as*190.55)+(a*125.3)+(l*180.9);
      	double t=15000;
      	if(t<=c)
          	System.out.print("No");
      	else
          	System.out.print("Yes");
	}
}