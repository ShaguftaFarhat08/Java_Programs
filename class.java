class A
{
public void displayA()
{
System.out.println("Inside A");
}
}
class B extends A
{
public void displayB()
{
System.out.println("Inside B");
}
}
class C extends B
{
public void displayC()
{
System.out.println("Inside C");
}
}
public class MultilevelInherit
{
public static void main(String[] argument)
{
C cobj=new C();
cobj.displayA();
cobj.displayB();
cobj.displayC();
}
}
