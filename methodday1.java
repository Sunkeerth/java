
public class methodday1 {
	float pi=3.14f;
	void area(float pi,int a) {
		System.out.println(pi*a*a);
	}
	void area(int a,int b,int c) {
		System.out.println(1/2*a*b*c);
	}
	void area(int b,float c) {
         System.out.println(pi*b*b);		
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		methodday1 ob=new methodday1();
		ob.area(3.14f, 23);
		ob.area(1,2,3);
		ob.area(3, 03.14f);
		

	}

}
