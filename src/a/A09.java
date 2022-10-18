package a;

public class A09 {
	
	int a=10;
	
	public void m1() {
		
		if (a<=10 && a>0) {
			System.out.println("experiaance < 3 years");
		}
		else if (a<=10 && a>10) {
			System.out.println("experiaance up to 3 years");
		}
		else {
			System.out.println("experiaance > 3 years");
		}
		
	}
	
	public void m2 () {
		
		if (a<10 && a>11) {
			System.out.println("experiaance < 3 years");
		}
		else if (a<=10 && a>0) {
			System.out.println("experiaance up to 3 years");
		}
		else {
			System.out.println("experiaance > 3 years");
		}
		
	}
	
	public void m3 () {
		
		int a=13;
		
		if (a<10 && a>0) {
			System.out.println("experiaance < 3 years");
		}
		else if (a<=10 && a>0) {
			System.out.println("experiaance up to 3 years");
		}
		else {
			System.out.println("experiaance > 3 years");
		}
		
	}


	public static void main(String[] args) {
	
		A09 ref=new A09 ();
		ref.m1();
		ref.m2();
		ref.m3();
		
	}

}


