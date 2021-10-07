public class ElectricCar extends Car{

    private int batteryCapacity;
    private int maxKm;
    private int whPrKm;

    public ElectricCar(String regNr, String make, String model, int year, int doorCount, int batteryCapacity, int maxKm) {
        super(regNr, make, model, year, doorCount);
        if (batteryCapacity < 0 || maxKm < 0 || year < 0 || doorCount < 0){
            throw new IllegalArgumentException();
        }
        this.batteryCapacity = batteryCapacity;
        this.maxKm = maxKm;
        this.whPrKm = batteryCapacity/maxKm;
        calculateGroenEjerAfgift();
    }

    public void calculateGroenEjerAfgift(){

        // Used to calculate biyearly fee
        // Det gøres ved at dividere whPrKm med 91,25 og dernæst dividere 100 med dette tal.
        double factor = whPrKm / 91.25 / 100;

        super.calculateGroenEjerAfgift(factor);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                super.toString() +
                ", batteryCapacity=" + batteryCapacity +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
