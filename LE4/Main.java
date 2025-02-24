class Main{
public static void main(String args[])
{
Single s1=Single.getinstance();
System.out.println(s1.x);
Single s2=Single.getinstance();
System.out.println(s2.x);
Single s3=new Single();
System.out.println(s3.x);
}
}