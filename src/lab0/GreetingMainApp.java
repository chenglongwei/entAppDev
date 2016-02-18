package lab0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenglongwei on 2/18/16.
 */
public class GreetingMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lab0/beans.xml");
        Greeter greeter = (Greeter) context.getBean("greeter");
        String greeting = greeter.getGreeting();
        System.out.println("Hello world from " + greeting);
    }
}
