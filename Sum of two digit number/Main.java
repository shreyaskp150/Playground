import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
		Scanner s=new Scanner(System.in);
      	int a=s.nextInt();
      	int b=a%10,c=a/10;
      	System.out.print((b+c));
	}
}