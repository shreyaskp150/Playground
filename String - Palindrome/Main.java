import java.util.Scanner; 
class Main 
{ 
    public static void main(String args[]) 
    { 
      	String r = "";
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	for(int i= s.length() - 1;i>=0;i--)
        {
        	r = r + s.charAt(i);
    	}
    	if(r.equals(s))
        {
        	System.out.println("Palindrome");
    	}
    	else
        {
        	System.out.println("Not a Palindrome");
    	}
    } 
} 