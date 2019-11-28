import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	String s=sc.next();
      	int a=sc.nextInt();
      	switch(s)
        {
          case "front": if(a==1)
            				System.out.print("Left Handed");
            			else if(a==2)
                          	System.out.print("Right Handed");
            			else
                          	System.out.print("Nothing");
            			break;
          case "rear": if(a==1)
            				System.out.print("Right Handed");
            			else
                          	System.out.print("Left Handed");
            			break;
        }
	}
}