import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	String str=s.next();
      	char c[]=str.toCharArray();
    	String alphabet="abcdefghijklmnopqrstuvwxyz";
    	int countArray[]=new int[26];
      	int i;
    	for(char x : c)
        {
        	for(i=0;i<alphabet.length();i++)
            {
            	if(alphabet.charAt(i)==x)
                {
                	countArray[i]++;
            	}
        	}
    	}
      	int a=96;
      	for(i=0;i<alphabet.length();i++)
        {
         	if(countArray[i]!=0)
            	System.out.printf("%c%d\n",(char)(a+i+1),countArray[i]);
        }
    }
}