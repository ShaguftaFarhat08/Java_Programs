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
class C extends A
{
public void displayC()
{
System.out.println("Inside C");
}
}
public class Hierarichalinheritance
{
public static void main(String[] argument)
{
C cobj=new C();
B bobj=new B();
cobj.displayC();
bobj.displayB();
cobj.displayA();
bobj.displayA();
}
}
