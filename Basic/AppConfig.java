import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{

  @Bean
  public A createA{
    A a = new A();
    a.setA(99);
    a.setMsg("A Bean");
    return a;
  }
  @Bean(name = "b")
  public B createB{
    B b = new B(199," B Bean ");
    return b;
  }
   @Bean("hello")
  public Hello createHello{
    Hello hello = new Hello();
    return hello;
  }
}
