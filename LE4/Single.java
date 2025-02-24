public class Single 
{
public static int x=0;
private Single()
{
this.x++;
}
private static Single singleinstance=null;
public static  Single getinstance()
{
if(singleinstance==null)
{
 singleinstance=new Single();
}
return singleinstance;
}
}