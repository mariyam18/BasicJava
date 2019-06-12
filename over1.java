class Parent
{
 void m1()
 {
  System.out.println("m1 of parent");
}
}
class Child extends Parent
{
  void m2()
{
System.out.println("In m1 of child");
}
}
class Main
{
public static void main(String arg[])
{
Child c=new Child();
c.m2();
Parent p=new Parent();
p.m1();
}
} 
