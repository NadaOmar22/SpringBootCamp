package Practice.model;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Plane implements Vehicle{
    Long id;
    String brand;
    String type;
}
