package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Plane plane = context.getBean("plane", Plane.class);
        plane.setName("plane");
        plane.save(plane);
        Car car = context.getBean("car", Car.class);
        car.setName("plane");
        car.save(plane);
    }
}
