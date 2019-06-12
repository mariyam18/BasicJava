class Parent
{
 void m1()
 {
  System.out.println("Hello world");
  }
}
 class Child extends Parent
{
}
class MyMain
{
 public static void main(String arg[])
 {
  Child c=new Child();
  c.m1();
 }
}

