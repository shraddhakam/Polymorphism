package polymorphism;

public class Cat extends Animal{
	static void method (Animal a)
	{
		if(a instanceof Cat)
		{
			Cat d=(Cat)a;//down casting
			System.out.println("Down Casting Performed");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  Animal a=new Cat();
			  Cat.method(a);
	}

}
