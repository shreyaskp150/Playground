import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int a=s.nextInt();
      	int b=s.nextInt();
      	int i;
      	for(i=a;i>=b;i--)
        {
          System.out.println(i);
        }
    }
}