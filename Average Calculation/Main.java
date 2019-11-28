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
      	int e=sc.nextInt();
      	float f=(float)(a+b+c+d+e)/5;
      	System.out.printf("%.2f",f);
    }
}