//Arya sharma
class SingleInheritance
{
int a=10;
}
class XYZ extends SingleInheritance
{
int b=20;
public static void main(String []args)
{
XYZ x=new XYZ();
System.out.println(x.a);
System.out.println(x.b);
}
}