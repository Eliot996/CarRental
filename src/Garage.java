import java.util.ArrayList;

public class Garage {

    private final ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public int calculateTotalGroenEjerAfgift(){
        int total = 0;
        for (Car car : cars) total += car.getGroenEjerAfgift();
        return total;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("These cars are in the car: \n");
        int i = 0;
        for (Car car : cars) {
            returnString.append(i).append(". ").append(car.toString()).append('\n');
            i++;
        }
        return returnString.toString();
    }
}


