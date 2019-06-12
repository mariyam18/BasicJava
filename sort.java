import java.util.*;

class Sort
{
 public static void main(String arg[])
{
int no, i,j,temp;

System.out.println("enter the no. of element");
Scanner sc= new Scanner (System.in);
no = sc.nextInt();
int a[]=new int[no];
System.out.println("enter the element");
for(i=0;i<no;i++)
{
 a[i]=sc.nextInt();
}
 for(i=0;i<no-1;i++)
  {
   for(j=0;j<no-1;j++)
  {
   if(a[j]>a[j+1])
    {
     temp=a[j];
     a[j]=a[j+1];
     a[j+1]=temp;
     }
   }
  }
  for(i=0;i<no;i++)
  {
  System.out.println("Sorted array\n"+a[i]);
  } 
 }
}

