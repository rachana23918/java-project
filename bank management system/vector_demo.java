import java.util.*;
class vector_demo
{
	public static void main(String arg[])
	{
		Vector list=new Vector();
		int len=args .length;
		for(int i=0;i<len;i++)
		{
			list.addElement(args[i]);
		}
		list.insertElementAt("os",1);
		int s=list.size();
		String array[]=new String[s];
		list.copyInto(array);
		System.out.println("list of elements");
		for(int i=0;i<s;i++)
		{
			System.out.println(array[i]);
		}
	}
}