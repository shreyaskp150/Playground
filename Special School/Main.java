import java.util.Scanner; 
class Main 
{ 
    public static void main(String args[]) 
    { 
      	Scanner s=new Scanner(System.in);
        String str=s.next();
      	String str3=s.next();
      	int i,j=0;
        char str1[]=str.toCharArray();
      	char str2[]=new char[str1.length];
        for(i=str1.length-1;i>=0;i--)
        {
            str2[j]=str1[i];
          	j++;
        }
      	String str4=new String(str2);
      	if(str4.equals(str3))
        {
          System.out.print("It is same");
        }
      	else
        {
          System.out.print("It is not same");
        }
    } 
} 