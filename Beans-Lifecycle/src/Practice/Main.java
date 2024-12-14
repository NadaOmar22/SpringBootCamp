package Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DatabaseOperations databaseOperations = context.getBean("database", DatabaseOperations.class);

        ((ClassPathXmlApplicationContext) context).close();

    }
}
