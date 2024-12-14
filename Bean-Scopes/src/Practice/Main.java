package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Square square = context.getBean("square", Square.class);
        square.draw3d.draw("square");
        Circle circle = context.getBean("circle", Circle.class);
        circle.draw2d.draw("circle");

    }
}
