package Practice.controller;

import Practice.dao.DatabaseOperations;
import Practice.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarController implements VehicleController {
    DatabaseOperations databaseOperations;

    @Autowired
    public CarController(DatabaseOperations databaseOperations){
        this.databaseOperations = databaseOperations;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        databaseOperations.save(vehicle);
    }
}
