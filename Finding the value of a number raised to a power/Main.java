import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      	int sum=1,i=1;
      	int a=in.nextInt();
      	int b=in.nextInt();
      	while(i<=b)
        {
          sum=sum*a;
          i++;
        }
      System.out.println(sum);
    }
}