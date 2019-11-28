import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int m=s.nextInt();
      	int n=s.nextInt();
      	int i,a,b;
      	for(i=m;i<=n;i++)
        {
          if(i>9 && i<100)
          {
            a=i/10;
            b=i%10;
            if(((a*b)+(a+b))==i)
              System.out.println(i);
          }
        }   
    }
}