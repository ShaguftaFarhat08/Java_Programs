public class Factorial
{
public static void main(String args[])
{
int n;
int i;
int mul;
n=8;
mul=1;
for(i=1;i<=n;i++)
{
mul=mul*i;
}
System.out.println("factorial of " +n+ "is" +mul);
}
}