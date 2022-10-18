package a;

public class A01 {
	
	public void bodmas() {
		
		int a=10,b=5;
		int c,d,e,f;
		c=a+b;
		d=a-b;
		e=a/b;
		f=a*b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
	public void bodmas1(int x,int y) {
		
		int z=x+y;
		
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		
		A01 ref=new A01 ();
		
		ref.bodmas();
		
		ref.bodmas1(100, 50);

	}

}
