package packages;

public class Class2 extends Class1
{
	public Class2()
	{
		this(1,2);
		System.out.println("Child default Constructor");
	}
	
	public Class2(int a)
	{
		this(1,2,3);
		System.out.println("Child 1 Paramater Constructor");
	}
	
	public Class2(int a, int b)
	{
		super(1,2);
		System.out.println("Child 2 Parameters Constructor");
	}
	
	public Class2(int a, int b, int c)
	{
		this();
		System.out.println("Child 3 Parameters Constructor");
	}
	
	public static void main(String[] args) 
	{
		Class2 obj = new Class2(1);
		
	}
}
