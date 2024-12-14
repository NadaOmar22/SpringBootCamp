package Practice.controller;

import Practice.dao.DatabaseOperations;
import Practice.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaneController implements VehicleController {
    @Autowired
    DatabaseOperations databaseOperations;

    @Override
    public void saveVehicle(Vehicle vehicle) {
        databaseOperations.save(vehicle);
    }
}
