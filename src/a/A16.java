package a;

public class A16 {
	public void table2() {
		int table=2;
		for (int i=1;i<=10;i++){
		System.out.print(i*table+"\n");
		}
	}
	
	public void table10() {
		int table=10;
		for (int i=1;i<=10;i++) {
			System.out.println("\n"+i*table );
			
		}
	}
	public static void main(String[] args) {
		A16 ref=new A16 ();
		ref.table2();
		ref.table10();
		
	}

}
