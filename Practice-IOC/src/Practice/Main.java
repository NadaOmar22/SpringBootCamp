package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        Circle circle = applicationContext.getBean("circle", Circle.class);
        circle.setRadius(num);
        System.out.println("The Area of the Circle : " + circle.getArea());

        Square square = applicationContext.getBean("square", Square.class);
        square.setLength(num);
        System.out.println("The Area of the Square : " + square.getArea());

        Rectangle rectangle = applicationContext.getBean("rectangle", Rectangle.class);
        rectangle.setWidth(num);
        rectangle.setHeight(num);
        System.out.println("The Area of the Rectangle : " + rectangle.getArea());
    }
}
