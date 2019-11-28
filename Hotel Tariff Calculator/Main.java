import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int m=s.nextInt();
      	float r=s.nextFloat();
      	int d=s.nextInt();
      	double a;
      	switch(m)
        {
          case 1:
          case 2:
          case 3:
          case 7:
          case 8:
          case 9:
          case 10:  a=r*d;
            		System.out.print(a);
            		break;
          case 4:
          case 5:
          case 6:
          case 11:
          case 12: 	a=r*1.2*d;
            		System.out.print(a);
            		break;
          default: System.out.println("Invalid Input");
          }
    }
}