public class Hello{

    A aobj;
    B bobj;

    public void setAobj(A aobj) {
		System.out.println("setter method in Hello");
		this.aobj = aobj;
	}
	
	public Hello(B bobj) {
		System.out.println("1 param constructor Hello Class");
		this.bobj = bobj;
	}
  
}
