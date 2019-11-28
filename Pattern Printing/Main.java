import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
      	int i,j;
        for(i=1;i<=r;i++)
        {
            for(j= c;j>c-i;j--)
            {
                System.out.print(j);
            }
            for(j= 1;j<=c-i;j++)
            {
                System.out.print(r - i + 1);
            }
            System.out.println();
        }
    }
}