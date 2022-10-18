package a;

public class A08 {
	
	public void m1() {
		
		int a=10;
		
		if (a<10) {
			System.out.println("experiaance < 3 years");
		}
		else if (a<=10) {
			System.out.println("experiaance up to 3 years");
		}
		else {
			System.out.println("experiaance > 3 years");
		}
		
	}
	
	public void m2() {
		
		int a=10;
		
		if (a<5) {
			System.out.println("experiaance < 3 years");
		}
		else if (a<=10) {
			System.out.println("experiaance up to 3 years");
		}
		else {
			System.out.println("experiaance > 3 years");
		}
		
	}
	
	public void m3() {
		
		int a=11;
		
		if (a<10) {
			System.out.println("experiaance < 3 years");
		}
		else if (a<=10) {
			System.out.println("experiaance up to 3 years");
		}
		else {
			System.out.println("experiaance > 3 years");
		}
		
	}
	

	public static void main(String[] args) {
		
		A08 ref=new A08 ();
		ref.m1();
		ref.m2();
		ref.m3();
	

	}

}
