import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	String str1=s.next();
      	String str2=s.next();
      	if(str1.equals(str2))
          System.out.print("Strings are same");
      	else
          System.out.print("Strings are not same");
	}
}