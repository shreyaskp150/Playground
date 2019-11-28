import java.util.Scanner; 
class Main 
{ 
    public static void main(String args[]) 
    { 
      	Scanner s=new Scanner(System.in);
        String str=s.next();
      	int i;
        char str1[]=str.toCharArray(); 
        for(i=str1.length-1;i>=0;i--)
        {
            System.out.print(str1[i]);
        }
    } 
} 