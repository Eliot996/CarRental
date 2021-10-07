public class GasolineCar extends Car{

    private int octane;
    private double kmPrL;

    public GasolineCar(String regNr, String make, String model, int year, int doorCount, int octane, double kmPrL) {
        super(regNr, make, model, year, doorCount);
        if (kmPrL < 0 || octane < 0 || year < 0 || doorCount < 0){
            throw new IllegalArgumentException();
        }
        this.octane = octane;
        this.kmPrL = kmPrL;

        calculateGroenEjerAfgift(kmPrL);
    }

    public void calculateGroenEjerAfgift(){
        calculateGroenEjerAfgift(kmPrL);
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                super.toString() +
                ", octane=" + octane +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
