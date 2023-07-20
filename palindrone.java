class palindrone
{
public static void main(String args[])
{
String S1="madam";
String S2;
S2=S1;
StringBuffer sb=new StringBuffer(S1);
sb.reverse();
String S3= sb.toString();
if(S3.equals(S2))
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
