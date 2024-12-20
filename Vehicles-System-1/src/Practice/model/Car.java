package Practice.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Car implements Vehicle{
    Long id;
    String brand;
    String type;
}
