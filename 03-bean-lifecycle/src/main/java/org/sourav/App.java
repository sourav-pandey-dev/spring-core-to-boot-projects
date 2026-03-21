package org.sourav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Machine m1 = context.getBean(Machine.class);
        Machine m2 = context.getBean(Machine.class);
        Machine m3 = context.getBean(Machine.class);


        AnotherMachine m4 = context.getBean(AnotherMachine.class);
        AnotherMachine m5 = context.getBean(AnotherMachine.class);
        AnotherMachine m6 = context.getBean(AnotherMachine.class);
        context.close();
    }

}
