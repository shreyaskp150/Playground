import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      	int a=n,b=0,c=n*n,d,e=1;
      	while(a!=0)
        {
          a/=10;
          b++;
        }
      	while(b!=0)
        {
          e=e*10;
          b--;
        }
      	d=(c%e)+(c/e);
      	if(d==n)
          System.out.print("Kaprekar Number");
      	else
          System.out.print("Not a Kaprekar Number");
    }
}