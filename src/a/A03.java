package a;

public class A03 {
	
	public static void bodmas (int a,int b) {
		
	//	int a,b;
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

	public static void main(String[] args) {
		
		bodmas (100,50);
		bodmas(1000,500);
			
	}

}
