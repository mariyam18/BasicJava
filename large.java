import java.util.*;

class Large
{
 public static void main(String arg[])
{
int no, i,j,temp;
System.out.println("enter the no. of element");
Scanner sc= new Scanner (System.in);
no = sc.nextInt();
int a[]=new int[no];
int large =a[0];

for(i=0;i<no;i++)
{
System.out.println("enter the element");
 a[i]=sc.nextInt();
}
for(i=0;i<no;i++)
{
 if(large < a[i])
 {
  large=a[i];
 }
}
System.out.println("largest no \t"+large);
}
}

