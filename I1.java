interface I1
{
void show();
}
class Test1 implements I1
{
public void show()
{System.out.println("1");}
}
class Test2 implements I1
{
public void show ()
{System.out.println("2");}
public static void main(String []args)
{Test2 t2=new Test2();
t2.show();
Test1 t1=new Test1();
t1.show();}
}