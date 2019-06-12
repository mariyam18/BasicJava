import java.util.*;

class Trans 
{
  public static void main(String arg[])
 {
  int i,j,temp;
  int a[][]=new int[3][3];
  Scanner sc =new Scanner(System.in);
  System.out.println("enter the element of matrix");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
  {
   a[i][j]=sc.nextInt();
   }
  }
  for(i=0;i<3;i++)
  {
   for(j=i;j<3;j++)
  {
   temp=a[i][j];
   a[i][j]=a[j][i];
   a[j][i]=temp;
   }
  }
  System.out.println("transpose matrix is");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
  {
   System.out.print(a[i][j]+"\t");
   }
   System.out.println();
  }
 }
}
