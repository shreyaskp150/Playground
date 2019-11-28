import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	if(a>100)
          	System.out.println("Invalid Input");
      	else if(a==100)
          	System.out.println("S");
      	else if(a>89 && a<100)
          	System.out.println("A");
      	else if(a>79 && a<90)
          	System.out.println("B");
      	else if(a>69 && a<80)
          	System.out.println("C");
      	else if(a>59 && a<70)
          	System.out.println("D");
      	else if(a>49 && a<60)
          	System.out.println("E");
 		else
          	System.out.println("F");
    }
}