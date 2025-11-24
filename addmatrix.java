/******************************************************************************
Program-1: Develop a JAVA program to add TWO matrices of suitable order MxN 
(The value of M, N should be read from command line arguments).
*******************************************************************************/
import java.util.Scanner;
public class matrices 
{
 public static void main(String[] args) 
 {
int i, j;
int m= Integer.parseInt(args[0]);
int n= Integer.parseInt(args[1]);
Scanner input=new Scanner(System.in);
System.out.println("Number of rows="+ m);
System.out.println("Number of columns="+n);
int a[ ][ ]=new int[m][n]; 
int b[ ][ ]=new int[m][n]; 
int c[ ][ ]=new int[m][n]; 
 System.out.println("Enter the elements for matrix a:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++) 
{
a[i][j]=input.nextInt();
}
}
System.out.println("Enter the elements for matrix b:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=input.nextInt();
}
}
 System.out.println("The Result of Addition of matrix is:"); 
for(i=0;i<m;i++)
{
for(j=0;j<n; j++)
{
c[i][j]= a[i][j] + b[i][j];
}
}
for(i=0;i<m;i++)
{
for (j=0;j<n; j++)
{ 
System.out.print(c[i][j]+"\t");
}
System.out.println(" ");
}
}
}