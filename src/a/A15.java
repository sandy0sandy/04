package a;

public class A15 {
	public void table2() {
		int table=2;
		for (int i=1;i<=10;i++){
		System.out.print(i*table+"\n");
		}
	}
	
	public void table10() {
		int table=10;
		for (int i=1;i<=10;i++) {
			System.out.println(i*table );
			
		}
	}
	public static void main(String[] args) {
		
		A15 ref=new A15 ();
		ref.table10();

	}

}
