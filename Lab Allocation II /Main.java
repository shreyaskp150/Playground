import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	int b=sc.nextInt();
      	int c=sc.nextInt();
      	String d=sc.next();
      	if(d.equalsIgnoreCase("L1"))
        {
        	if(b<c)
        		System.out.println("L2");
      		else
        		System.out.println("L3");
        }
      	else if(d.equalsIgnoreCase("L2"))
        {
        	if(a<c)
        		System.out.println("L1");
      		else
        		System.out.println("L3");
        }
      	else if(d.equalsIgnoreCase("L3"))
        {
        	if(a<b)
        		System.out.println("L1");
      		else
        		System.out.println("L2");
        }
    }
}