import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int c=in.nextInt(),a,b,d;
      switch(c)
      {
        case 1: a=in.nextInt();
          		b=a*a;
          		System.out.println(b);
          		break;
        case 2: a=in.nextInt();
          		b=in.nextInt();
          		d=a*b;
          		System.out.println(d);
          		break;
        case 3: a=in.nextInt();
          		b=in.nextInt();
          		d=(a*b)/2;
          		System.out.println(d);
          		break;
        case 4: a=in.nextInt();
          		double e=3.14*a*a;
          		System.out.println(e);
          		break;
      }
    }
}