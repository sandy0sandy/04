package a;

public class A02 {
	
	public static void bodmas () {
		
		int a=10,b=5;
		int c,d,e,f;
		c=a+b;
		d=a-b;
		e=a/b;
		f=a*b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(" "+ f);
		
		System.out.println("static method does not need creation of object we directly called it by caling method in main method");
	}

	public static void main(String[] args) {
		
		bodmas();

	}

}
