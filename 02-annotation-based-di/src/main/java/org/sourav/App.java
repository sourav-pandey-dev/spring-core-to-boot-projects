package org.sourav;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = context.getBean(Student.class);

        System.out.println(s1.getCourse().getCourseName());

    }
}
