import java.util.Scanner;
class Facto
{
 int facto(int a)
{
 int fact=1,i;
 for(i=1;i<=a;i++)
{
 fact=fact*i;
}
 return fact;
}
 public static void main(String arg[])
{
 int no,ans;
 System.out.println("enter the no.");
  Scanner sc =  new Scanner(System.in);
  no= sc.nextInt();
  Facto f=new Facto();
  ans=f.facto(no);
 System.out.println("factorial="+ans);
 }
}
