import java.util.*;
class Test
{
	Test()
	{
		System.out.println("Test :: cons");
	}
	void m1()
	{
		System.out.println("Test :: m1");
	}
}
class Demo
{
	void m1()
	{
		System.out.println("Demo :: m1");
	}
}
class ReflectionDemo1 
{
	public static void main(String[] args) throws Exception
	{
		Test t=new Test(); //Method-1
		t.m1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Class Name :: ");//Raja
		String name=s.next();
		Class c=Class.forName(name);
		Object obj=c.newInstance();//Method-2
		if(obj instanceof Test)
		{
			Test t1=(Test)obj;
			t1.m1();
		}
		else
		{
			Demo d1=(Demo)obj;
			d1.m1();
		}
		Class cls=Test.class;//Method-3
		System.out.println(cls.getClass().getName());
		Object obj1=cls.newInstance();
		Test t11=(Test)obj1;
		t11.m1();
	}
}
