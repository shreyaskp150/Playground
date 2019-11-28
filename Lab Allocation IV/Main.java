import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	int b=sc.nextInt();
      	int c=sc.nextInt();
      	int d=sc.nextInt();
      	int s,sl,g;
      	String e,f,h;
      	if(a<b && a<c)
        {
          s=a;
          e="L1";
        }
      	else if(b<c)
        {
          s=b;
          e="L2";
        }
      	else
        {
          s=c;
          e="L3";
        }
      	if(a>b && a>c)
        {
          g=a;
          h="L1";
        }
      	else if(b>c)
        {
          g=b;
          h="L2";
        }
      	else
        {
          g=c;
          h="L3";
        }
      	if((a>b && a<c)||(a<b && a>c))
        {
          sl=a;
          f="L1";
        }
      	else if((a<b && b<c)||(a>b && b>c))
        {
          sl=b;
          f="L2";
        }
      	else
        {
          sl=c;
          f="L3";
        }
      	if(d<=s)
        	System.out.print(e);
      	else if(d>s && d<=sl)
        	System.out.print(f);
      	else if(d>sl && d<=g)
          	System.out.print(h);
      	else
          System.out.print("0");
    }
}