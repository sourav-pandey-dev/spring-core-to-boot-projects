package org.sourav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Car car1 = (Car) context.getBean("C1");
        Car car2 = (Car) context.getBean("C2");
        System.out.println(car1);
        System.out.println(car2);
        car1.getEngine().start();
        car1.getEngine().accelerator();
        car1.getEngine().stop();
        car2.getEngine().start();
        car2.getEngine().accelerator();
        car2.getEngine().stop();
    }
}
