import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a=0,b=0,c=1,d=0,i;
      	System.out.print(a+" "+b+" "+c);
      	for(i=4;i<=n;i++)
        {
          d=a+b+c;
          System.out.print(" "+d);
          a=b;
          b=c;
          c=d;
        }
    }
}