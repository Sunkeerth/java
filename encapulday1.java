
 class encapulday1 {
	 private int cid;
	 private String cname;
	 private long cnumber;
	 
	 public void setdat(int a,String b,long c) {
		 cid=a;
		 cname=b;
		 cnumber=c;
	 }
	 int getcid() {
		 return cid;
	 }
	 String getcname(){
		 return cname;
	 }
	 long getcnumber(){
		 return cnumber;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapulday1 ob=new encapulday1();
		ob.setdat(1,"sunkeerth",9113838854L);
		System.out.println(ob.getcid());
		System.out.println(ob.getcname());
		System.out.println(ob.getcnumber());
		

	}

}
