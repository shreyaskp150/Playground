import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      while(a<=b)
      {
        System.out.println(a);
        a++;
      }
    }
}