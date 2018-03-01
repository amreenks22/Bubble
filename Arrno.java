class Arrno
{
public static void main(String args[])
{
int i,j,temp,n;
int a[]=new int[5];
 n=Integer.parseInt(args[0]);

for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(args[i+1]);
}
for(i=0;i<n;i++)
{
System.out.println("args["+i+"]=" +a[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("element in sorted order");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}