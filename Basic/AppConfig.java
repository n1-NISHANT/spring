
@Configuration
public class AppConfig{

  @Bean
  public A createA{
    A a = new A();
    return a;
  }
  @Bean(name = "b")
  public B createB{
    B b = new B();
    return b;
  }
   @Bean("hello")
  public Hello createHello{
    Hello hello = new Hello();
    return hello;
  }
}
