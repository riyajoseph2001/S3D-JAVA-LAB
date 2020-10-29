public class Palindrome
{
  public static void main(String args[])
  {
    int n= 5674;
    int var,temp,result=0;
    temp=n;
    while(n>0)
    {
      var=n%10;
      result=(result*10)+var;
      n=n/10;
    }
    if(temp==result)
     System.out.println(temp+" is palindrome");
    else
     System.out.println(temp+" is not palindrome");
  }
} 