package a;

public class A12 {
	
	public void table2() {
		int table=1;
		while (table<=10) {
			int x=table*2;
			System.out.print(" " + x +" ");
			table++;
		}
	}
	public void table5() {
		int table=1;
		while (table<=10) {
			int y=table*5;
			System.out.println(" " + y +" ");
			table++;
		}
	}

	public static void main(String[] args) {
		A12 ref=new A12();
		ref.table2();
		ref.table5();
	}
}
