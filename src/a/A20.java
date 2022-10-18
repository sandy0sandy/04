package a;

public class A20 extends A19 {
	
	public void mm1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	}
	public void mm2() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		A20 ref=new A20 ();
		ref.mm1();
		//ref.mm2();

	}

}
