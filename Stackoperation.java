/******************************************************************************
Program-2: Develop a stack class to hold a maximum of 10 integers with suitable methods.
Develop a JAVA main method to illustrate Stack operations.
*******************************************************************************/
import java.util.Scanner;
public class stack 
{
 final int Max=100;
 int s[]= new int[Max];
 int top=-1;
 void push(int ele)
 {
if(top>=Max-1)
System.out.println("Stack Overfolw");
else
s[++top]=ele;
 }
 int pop()
 {
int z=0;
if(top== -1)
 System.out.println("stack underflow");
else
 z=s[top--];
 return z;
 }
 void display()
 {
if(top== -1)
 System.out.println("stack empty");
else
{
for(int i=top;i>-1;i--)
 System.out.println(s[i]+"");
 }
 }
 public static void main(String[] args) 
 {
int q=1;
stack m = new stack();
System.out.println("stack operations");
Scanner sc=new Scanner(System.in);
while(q!=0)
{
System.out.println("Enter 1.push 2. pop 3. Display 4.Exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1 : 
System.out.println("Enter element to be pushed");
int ele=sc.nextInt();
m.push(ele);
break;
case 2 : 
 int popele;
popele=m.pop();
System.out.println("poped element is "+popele);
break;
case 3 : 
 System.out.println("Elements in stack are");
m.display();
break;
case 4 :
 q=0;
break;
}
}
System.out.println("Completed");
 } 
}