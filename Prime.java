public class Prime
{
  public static void main(String args[])
  {
   int n=55;
   boolean prime=false;
   for(int i=2;i<=n/2;i++)
   {
     if(n % i ==0)
     {
       prime = true;
       break;
     }
   }
   if(!prime)
     System.out.println(n+" is a prime number");
   else
     System.out.println(n+" is not a prime number");
  }
}