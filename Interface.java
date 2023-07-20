interface InterfaceOne
{
public void methodone();
}
interface InterfaceTwo extends InterfaceOne
{
public void methodtwo();
}
class ImplementClass implements InterfaceTwo
{
public void methodone()
{
System.out.println("text from method one....");
}
public void methodtwo()
{
System.out.println("text from method two....");
}
}
class Interface
{
public static void main(String[]args)
{
ImplementClass obj=new ImplementClass();
obj.methodone();
obj.methodtwo();
}
}