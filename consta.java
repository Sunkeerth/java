package dyaily_practice;

public class consta {
	private int a=1;
	private int b=2;
	private int c=3;
	public consta() {
		a=22;
		b=33;
		c=44;
		System.out.println(a+b+c+"empty constructor");
	}

	public consta(int e,int f,int g) {
		// TODO Auto-generated constructor stub
		this.a=e;
		this.b=f;
		this.c=g;
	}
	public consta(short e,short f,short g) {
		this.a=e;
		this.b=f;
		this.c=g;
		
	}
	public int getdet() {
		return a;
	}
	public int getdet1() {
		return b;
	}
	public int consta1() {
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consta ob=new consta(12,13,14);
		System.out.println(ob.getdet());
		System.out.println(ob.getdet1());
		System.out.println(ob.consta1());
		consta ob1=new consta();

	}

}
