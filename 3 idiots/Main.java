import java.util.Scanner;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int x1=sc.nextInt();
      	int y1=sc.nextInt();
        int x2=sc.nextInt();
      	int y2=sc.nextInt();
      	System.out.print("Binoy's house is located at ("+((float)(x1+x2)/2));
      	System.out.print(","+((float)(y2+y1)/2)+")");
    }
}