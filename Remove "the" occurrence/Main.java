import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	String str=s.nextLine();
      	String str2=str.replace("the ","");
      	System.out.printf("%s",str2);
	}
}