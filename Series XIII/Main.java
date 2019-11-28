import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
      	int i,a=5;
      	System.out.print(a);
      	for(i=1;i<(n*2)-2;i+=2)
        {
       		a=a+(11*i);
            System.out.print(" "+a);
        }
	}
}