import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	String a=sc.nextLine();
      	float b=sc.nextFloat();
      	int c=sc.nextInt();
      	int d=sc.nextInt();
      	if(a.equals("MSDS"))
        	System.out.printf("%.2f",(b+c));
      	else if(a.equals("MSH"))
        	System.out.printf("%.2f",(b+d));
      	else if(a.equals("MGSDS"))
        	System.out.printf("%.2f",(1.5*b)+c);
      	else if(a.equals("MGSH"))
          	System.out.printf("%.2f",(1.5*b)+d);
      	else
          	System.out.print("Invalid");
    }
}