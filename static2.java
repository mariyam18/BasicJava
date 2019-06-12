class First
{
  void m1()
{
System.out.println("In m1 of first");
}

static void m2()
{
System.out.println("In m2 of first");
First f =new First();
f.m1();
}
}
class MyMain
{
public static void main(String a[])
{


First.m2();
}
}
