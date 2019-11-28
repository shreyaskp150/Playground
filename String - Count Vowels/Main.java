import java.util.Scanner; 
class Main 
{ 
    public static void main(String args[]) 
    { 
      	Scanner s=new Scanner(System.in);
        String str=s.next();
      	int i,c=0;
        char str1[]=str.toCharArray(); 
        for(i=0;i<str.length();i++)
        {
            if(str1[i]=='A'||str1[i]=='E'||str1[i]=='I'||str1[i]=='O'||str1[i]=='U'||str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u') 
            	c++;  
        }
      	System.out.print(c);
    } 
} 