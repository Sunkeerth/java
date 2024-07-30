package dyaily_practice;

public class constprCTRICE {
	private int std_id;
	private String std_name="";
	private int std_age ;
	public void setdata(int a,String b,int c) {
		this.std_id=a;
		this.std_name=b;
		this.std_age=c;
		System.out.println(std_id+std_name+std_age+" inside the seter calss of encapsulation:");
		
	}
	public int getdet() {
		return std_id;
	}
	public String getdeta() {
		return std_name;
	}
	public int getdetal() {
		return std_age;
	}

	public constprCTRICE() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constprCTRICE ob=new constprCTRICE();
		ob.setdata(160, "Sunkeerth", 21);
		System.out.println(ob.getdet());
		

	}

}
