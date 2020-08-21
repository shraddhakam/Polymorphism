package polymorphism;

public class Bindingchild extends Binding {

	void run()
	{
		System.out.println("I am a child one");
		
	}
	
	
	void  hello()
	{
		System.out.println("I am hello and belong to child class");
	}
	public static void main(String[]args)
	{
		Binding c= new Bindingchild();//up casting
		c.run();
		c.hi();
	}
}
