import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	float a=sc.nextFloat();
      	float b=sc.nextFloat();
      	if(a<(b*12))
        	System.out.printf("Profit : Rs.%.2f",((b*12)-a));
      	else if(a>(b*12))
        	System.out.printf("Loss : Rs.%.2f",(a-(b*12)));
      	else
        	System.out.println("No profit nor loss");
    }
}