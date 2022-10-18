package a;

public class A05 {
	
	public int  bodmas(int x, int y) {
		
		int sub=x-y;
		
		System.out.println("returns sub");
		
		return sub;
		
		
	}

	public static void main(String[] args) {
	
		A05 ref=new A05();
		
		ref.bodmas(10, 5);

	}

}
