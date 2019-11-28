import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a=0;
      	while(n>1)
        {
          System.out.println(n);
          if(n%2==0)
            n=n/2;
          else
            n=(3*n)+1;
          a++;
        }
      	if(n==1)
          System.out.println(n);
      	System.out.print(a);
    }
}