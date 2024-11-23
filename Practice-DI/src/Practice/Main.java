package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        Circle circle = applicationContext.getBean("circle", Circle.class);
        circle.getDraw2d().draw("Circle");

        Square square = applicationContext.getBean("square", Square.class);
        square.getDraw3d().draw("Square");
    }
}
