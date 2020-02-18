import java.lang.reflect.*;
class Student
{
	public int x=10;
	int y=20;
	private int z=30;
	protected int p=40;

	void m1(int x,float y){
		System.out.println("Student :: m1");
	}
	public static final synchronized int m2(){
		System.out.println("Student :: m2");
		return 0;
	}
	protected final long m3(double d,Object o){
		System.out.println("Student :: m3");
		return 0;
	}
	private static Object m4(){
		System.out.println("Student :: m4");
		return "Raja";
	}
}
class ReflectionDemo3 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		Class c=s.getClass();
		Method[] m=c.getDeclaredMethods();
		for(Method m1 : m)
		{
			System.out.println("Method Name :: "+m1.getName());
			System.out.println("Return Type :: "+m1.getReturnType());
			int cnt=m1.getModifiers();
			System.out.println(cnt);
			System.out.println("Modifiers :: "+Modifier.toString(cnt));
			Class[] cl=m1.getParameterTypes();
			for(Class cl1 : cl)
			{
				System.out.println("Parameter :: "+cl1.getName());
			}
			System.out.println("..........................");
		}
	}
}
