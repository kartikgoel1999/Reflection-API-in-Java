import java.lang.reflect.*;
class Test1
{
	public int pp;
	int yy;
	public void m11(){}
	void m22(){}
}
class Student extends Test1
{
	Student(){}
	Student(int x){}
	Student(int x,int y){}
	Student(int x,int y,int z){}
	public int x=10;
	int y=20;
	private int z=30;
	protected int p=40;

	void m1(){
		System.out.println("Student :: m1");
	}
	public void m2(){
		System.out.println("Student :: m2");
	}
	protected void m3(){
		System.out.println("Student :: m3");
	}
	private void m4(){
		System.out.println("Student :: m4");
	}
}
class ReflectionDemo2 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		Class c=s.getClass();
		/*Field[] fld=c.getDeclaredFields();
		for(Field f:fld)
		{
			System.out.println(f.getName());
		}*/
		/*Field[] fld=c.getFields();
		for(Field f:fld)
		{
			System.out.println(f.getName());
		}*/

		/*Method[] m=c.getDeclaredMethods();
		for(Method m1 : m)
		{
			System.out.println(m1+"-->"+m1.getName());
		}*/
		/*Method[] m=c.getMethods();
		for(Method m1 : m)
		{
			System.out.println(m1+"-->"+m1.getName());
		}*/
		
		Constructor[] cons=c.getDeclaredConstructors();
		for(Constructor c1 : cons)
		{
			System.out.println(c1+"-->"+c1.getName());
		}
		
	}
}
