
public class A 
{
	int a;
	int b;
	public int OL(int p,int q) //Overloading
	{
		int z=p*q;
		return z;
	}
	public int OL(int r,int s,int t) //overloading
	{
		int v=r*s*t;
		return v;
	}
	public void hello()
	{
		System.out.println("Hello Guys Im father of all");
	}
	public A(int a,int b) //Constructor
	{
		this.a=a; //this keyword 
		this.b=b;
	}
	public int mul()
	{
		return a*b;
	
	}
}	

