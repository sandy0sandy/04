package a;

public class A18 {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++) {
			for(int j=i;j<=10;j++) {
				System.out.print("s");
			}
			System.out.println(" ");
		}
		System.out.println();
		for (int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("d");
			}
			System.out.println(" ");
		}
	}

}
