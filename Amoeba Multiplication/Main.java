import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a=0,b=1,c=0,i;
      	for(i=3;i<=n;i++)
        {
          c=a+b;
          a=b;
          b=c;
        }
      	System.out.print(c);
    }
}