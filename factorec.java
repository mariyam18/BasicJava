import java.util.*;
class Factorial
{
 static int facto(int no)
 {
  if(no==1)
  return 1;
  else 
   return (facto(no-1)*no);
  }
   public static void main(String arg[])
   {
    int no,res;
    System.out.println("enter the no.");
  Scanner sc =  new Scanner(System.in);
  no= sc.nextInt();
  res=facto(no); 
  System.out.println("factorial="+res);
}
}     
