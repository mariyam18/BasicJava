import java.util.*;

class Calculator
{
 public static void main (String arg[])
 {
  int no1,no2,op,ans,choice;
  Scanner sc =new Scanner(System.in);
  do
  {
  System.out.println("enter the two no");
  no1=sc.nextInt();
  no2=sc.nextInt();
  System.out.println("1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide");
  op=sc.nextInt();
  
  switch(op)
  {
   case 1: ans=no1+no2;
   System.out.println("Add"+ans);
   break;
   case 2:ans =no1-no2;
   System.out.println("subtract"+ans);
   break;
   case 3: ans=no1*no2;
   System.out.println("Multiply"+ans);
   break;
   case 4: ans=no1/no2;
   System.out.println("Divide"+ans);
   break;
  }
 System.out.println("preess 1 to continue 0 to exit");
 choice =sc.nextInt();
 }while(choice==1);
 }
}
