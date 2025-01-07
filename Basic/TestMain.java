import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain{
  public static void main (String [] args){
      ApplicationContext cgf = new AnnotationConfigApplicationContext(AppConfig.java);
      Hello hello = (Hello)cfg.getBean("hello");
      Systrm.out.println(hello);
      hello.show();
  } 
}
