public class B{
     int b;
     String str;

  static{
      System.out.println("static bloc in B");
  }

  public B(int b, String str){
      this.b = b;
      this.str = str;
  }

  public String toString(){
          return "b : "+b + " str : "+str;
  }
}
