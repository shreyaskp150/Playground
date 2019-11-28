import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	float t=sc.nextFloat();
      	if(a==2)
        {
          System.out.printf("%.2f",1.5*t);
        }
      	else if(a<2)
        {
          System.out.printf("%.2f",t);
        }
      	else if(a==3)
        {
          System.out.printf("%.2f",2*t);
        }
      	else
        {
          System.out.print("Number of items is more");
        }
	}
}