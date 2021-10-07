public abstract class  Car {

    protected String regNr;
    protected String make;
    protected String model;
    protected int year;
    protected int doorCount;
    protected int grønEjerAfgift;

    public Car(String regNr, String make, String model, int year, int doorCount) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.year = year;
        this.doorCount = doorCount;
    }

    public void calculateGroenEjerAfgift(double factor){
        if (factor < 5){
            grønEjerAfgift = 10470;
        } else if (factor < 10){
            grønEjerAfgift = 5500;
        } else if (factor < 15){
            grønEjerAfgift = 2340;
        } else if (factor < 20){
            grønEjerAfgift = 1050;
        } else if (factor < 50){
            grønEjerAfgift = 330;
        }
    }

    public int getGrønEjerAfgift() {
        return grønEjerAfgift;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doorCount=" + doorCount +
                ", grønejerafgift=" + grønEjerAfgift +
                '}';
    }
}
