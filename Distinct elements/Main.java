import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    int i,j,c=0;
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++) 
    {   
        for(j=0; j < i; j++) 
            if (a[i] == a[j]) 
                break; 
             if (i == j) 
            	c++;
        
     }
     System.out.print(c);
  }
}