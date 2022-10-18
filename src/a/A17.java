package a;

public class A17 {
	
	int x;
	String name;
	char charr;
//	
//	public A17 (int i) {
//		this.x=i;
//		System.out.println("xxxxxxxxxxxxx");
//	}
	
	public A17(String s,char c,int i) {
		this.name=s;
		this.charr=c;
		this.x=i;
	}
	
	public void m1() {
		System.out.println();	
		System.out.println(name);	
		System.out.println(charr);	
		System.out.println(x);	
		
		System.out.println();	
		System.out.print(name +" ");	
		System.out.print(charr +" ");	
		System.out.print(x);	
	}

	public static void main(String[] args) {
		A17 ref=new A17 ("Sandeep",'s',1000000);
		
		ref.m1();
	}

}

/*
o/p
Sandeep
s
1000000

Sandeep s 1000000
 */
