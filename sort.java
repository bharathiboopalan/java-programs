import java.io.*;
import java.util.*;
class sort
{
public static void main(String args[])
{
int i,j,n,t;
System.out.println("enter upper limit:");
Scanner in=new Scanner(System.in);
n=in.nextInt();
int[] a=new int[6];
Scanner sc=new Scanner(System.in);
System.out.println("enter the elements");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n-1;i++)
{
for(j=i;j<=n-1;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("numbers in ascending order");
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}

