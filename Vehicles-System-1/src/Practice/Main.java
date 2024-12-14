package Practice;

import Practice.config.Config;
import Practice.dao.DatabaseOperations;
import Practice.model.Bike;
import Practice.model.Car;
import Practice.model.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DatabaseOperations databaseOperations = context.getBean("databaseOperations", DatabaseOperations.class);
        Car car = context.getBean("car", Car.class);
        Bike bike = context.getBean("bike", Bike.class);
        Plane plane = context.getBean("plane", Plane.class);

        car.setBrand("car brand");
        car.setType("car type");
        databaseOperations.save(car);
    }
}
