public class Amstrong
{
  public static void main(String args[])
  {
   int n=176;
   int var,result=0,temp;
   temp=n;
   while(temp!=0)
   {
    var=temp%10;
    result+=var*var*var;
    temp/=10;
   }
   if(result==n)
   System.out.println(n + " is amstrong");
   else
   System.out.println(n + " is not amstrong");
  }
}