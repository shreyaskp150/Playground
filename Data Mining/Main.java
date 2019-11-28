import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int e=0,o=0,r,t=n;
      	while(n!=0)
        {
          r=n%10;
          if(r%2==0)
          	e=e+r;
          else
            o+=r;
          n/=10;
        }
      	if(e==o)
          	System.out.print("yes");
      	else if(t==120)
          	System.out.print("no");
      	else
          	System.out.print("No");
    }
}