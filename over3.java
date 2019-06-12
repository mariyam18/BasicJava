
class First
{
  private void m1()
 {
  System.out.println("m1 of parent");
}
void m2()
{
System.out.println(" in m2 of first");
m1();
}
}
class Second 
{

  public static void main(String arg[]) 
 {
  First f=new First();
f.m2();
}
}









