public class B extends A
{
	int c;
	public void hello() //overriding 
	{
		System.out.println("Hello Im Back");
	}
	public B(int x,int y, int z)//constructor
	{
		super(x,y); // super key 
		c=z;
	}
	public int mul()
	{
		return a*b*c;
		
	}
	void display()
	{
		hello();//sub class //overriding 
		super.hello();//super class 
	}
	
	public static void main(String[] args)
	{	
		B obj =new B(5,7,8);
		int test=obj.mul();
		A obj1=new A(9,3);
		int test1=obj1.mul();
		obj.display();
		int OLoading=obj1.OL(9,7);
		int Oloading1=obj1.OL(8,6,8);
		System.out.println(+OLoading);
		System.out.println(+Oloading1);
		System.out.println(+test);
		System.out.println(+test1);
		
		
	}
		
}