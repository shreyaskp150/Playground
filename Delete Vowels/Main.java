import java.util.Scanner; 
class Main 
{ 
    public static void main(String args[]) 
    { 
      	Scanner s=new Scanner(System.in);
        String str=s.next();
      	String str2=str.replaceAll("[aeiouAEIOU]","");
      	System.out.print(str2);
    } 
} 