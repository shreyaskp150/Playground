import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int a=n,b=0;
      	while(n!=0)
        {
          n/=10;
          b++;
        }
      	if(b==3 && ((a/10)%10)%3==0)
          	System.out.print("Trendy Number");
      	else
          	System.out.print("Not a Trendy Number");
    }
}