public class A{
      int a;
      String msg;
  statc{
        System.out.println("sctatic blck in A class");
        
  }
  public A(){
         System.out.println("default cunstructor in A");
  }
  public void setA(int a){
          this.a = a;
  }
  public void setMsg(String msg){
          this.msg = msg;
  }
  public String toString(){
      return "a : "+a+" msg : "+msg;
  }
}
