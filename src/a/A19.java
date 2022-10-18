package a;

public class A19 {
	
	public void m1() {
		for (int i=1;i<=10;i++) {
			for(int j=i;j<=10;j++) {
				System.out.print("&");
			}
			System.out.println(" ");
		}
	}
	
	public void m2 () {
		for (int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("&");
			}
			System.out.println(" ");
		}
	}
	
	public void m3 () {
		for (int i=3;i<=10;i++) {
			for(int j=i;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public void m4 () {
		for (int i=5;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
		public static void main(String[] args) {
			A19 ref=new A19();
			ref.m1();
			System.out.println();
			ref.m2();
			System.out.println();
			ref.m3();
			System.out.println();
			ref.m4();
			

	}

}
