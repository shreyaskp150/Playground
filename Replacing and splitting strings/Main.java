import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = sc.nextInt();
        String str3 = str1.replace(str1, str2);
        String flag[] = str3.split(" ",n);
        for(String res: flag)
        System.out.println(res);
    }
}