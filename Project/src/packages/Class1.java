package packages;

public class Class1 
{
	public Class1()
	{
		this(1,2,3);
		System.out.println("Parent default Constructor");
	}
	
	public Class1(int a)
	{
		this();
		System.out.println("Parent 1 Paramater Constructor");
	}
	
	public Class1(int a, int b)
	{
		this(1);
		System.out.println("Parent 2 Parameters Constructor");
	}
	
	public Class1(int a, int b, int c)
	{
		System.out.println("Parant 3 Parameters Constructor");
	}
	
	
}
