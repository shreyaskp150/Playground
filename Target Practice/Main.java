import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int sum=0,n,count=0;
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        while(sum<a){
            n=scan.nextInt();
            sum=sum+n;
            count++;
        }
        System.out.println("The number of turns is "+count);
    }
}