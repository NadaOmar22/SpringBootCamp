package Practice.dao;


import Practice.model.Vehicle;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class DatabaseOperations {

    String userName;
    String password;
    String url;

    void connectToDatabase(){
        System.out.println("connection to database established ……");
    }

    void disconnectFromDatabase (){
        System.out.println("connection to database closed……");
    }

    public void save(Vehicle vehicle){
        System.out.println("save vehicle ...." );
    }
}
