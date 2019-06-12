import java.util.*;
class MyArea
{
 double area(double r)
 {
  double ar=3.14*r*r;
  return ar;
 }
    int area(int l,int b)
 {
  int ar=l*b;
  return ar;
  }
}
 
class Mymain
{
 public static void main(String arg[])
 {
  int l,b,ans1;
  double r,ans2;
  System.out.println("enter the l,b,r");
  Scanner sc=new Scanner(System.in);
  l=sc.nextInt();
  b=sc.nextInt();
  r=sc.nextDouble();
  
  MyArea m=new MyArea();
  ans2=m.area(r);
  ans1=m.area(l,b);
  System.out.println("Area of circle="+ans2+"\nArea of rectangle="+ans1);
  }
} 
