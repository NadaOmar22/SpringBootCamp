package Practice;

public class Car implements Vehicle {

    String name;

    DataBaseOperation dataBaseOperation;

    public Car(DataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save(Vehicle vehicle){
        dataBaseOperation.save(vehicle);
    }

    @Override
    public String getName(){
        return this.name;
    }
}
