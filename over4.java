 class Oopm
{
 final int i=10;
 
  void m1()
{

 System.out.println("Good morning");
}
}
class Java extends Oopm
{
void m1()
{
System.out.println("hello");
 }
}
class Mymain
{
public static void main(String arg[])
{
Java j=new Java();
j.m1();
int k=j.i+5;
System.out.println(k);
}
}
