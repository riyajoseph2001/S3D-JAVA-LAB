public class Factorial
{
  public static void main(String args[])
  {
    int n=15;
    int fact=1;
    
    for(int i=1;i<=n;i++)
    {
      
      for(int j=1;j<=i;j++)
      {
       fact=fact*j;
      } 
      System.out.println("Factorial of " + i +"="+ fact);
      fact=1;
      
    }
    
  }
}