import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int a=s.nextInt();
      	int i,b,c=0,d=0;
      	for(i=1;i<=a;i++)
        {
          b=s.nextInt();
          if(b>0)
            c++;
          else
            d++;
        }
      	System.out.printf("Number of positive numbers is %d and the number of negative numbers is %d",c,d);
    }
}