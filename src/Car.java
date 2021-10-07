public abstract class  Car {

    protected String regNr;
    protected String make;
    protected String model;
    protected int year;
    protected int doorCount;
    protected int groenEjerAfgift;

    public Car(String regNr, String make, String model, int year, int doorCount) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.year = year;
        this.doorCount = doorCount;
    }

    protected void calculateGroenEjerAfgift(double factor){
        if (factor < 5){
            groenEjerAfgift = 10470;
        } else if (factor < 10){
            groenEjerAfgift = 5500;
        } else if (factor < 15){
            groenEjerAfgift = 2340;
        } else if (factor < 20){
            groenEjerAfgift = 1050;
        } else if (factor < 50){
            groenEjerAfgift = 330;
        }
    }

    public int getGroenEjerAfgift() {
        return groenEjerAfgift;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doorCount=" + doorCount +
                ", grønejerafgift=" + groenEjerAfgift +
                '}';
    }
}
