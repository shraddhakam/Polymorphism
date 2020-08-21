package polymorphism;

public class Line extends Rectangle {
	void Shpedraw() {
		System.out.println("Line");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting s=new Rectangle();
		Upcasting s1=new Line();
		s.Shpedraw();
		s1.Shpedraw();
		

	}

}
