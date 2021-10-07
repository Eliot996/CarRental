public class DieselCar extends Car{

    private boolean harParticleFilter;
    private double kmPrL;

    public DieselCar(String regNr, String make, String model, int year, int doorCount, boolean harParticleFilter, double kmPrL) {
        super(regNr, make, model, year, doorCount);
        if (kmPrL < 0 || year < 0 || doorCount < 0){
            throw new IllegalArgumentException();
        }
        this.harParticleFilter = harParticleFilter;
        this.kmPrL = kmPrL;
        this.calculateGroenEjerAfgift();
    }

    public void calculateGroenEjerAfgift(){
        if (kmPrL < 5){
            grønEjerAfgift = 15260;
        } else if (kmPrL < 10){
            grønEjerAfgift = 2770;
        } else if (kmPrL < 15){
            grønEjerAfgift = 1850;
        } else if (kmPrL < 20){
            grønEjerAfgift = 1390;
        } else if (kmPrL < 50){
            grønEjerAfgift = 130;
        }

        if (!harParticleFilter) grønEjerAfgift += 1000;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                super.toString() +
                ", harParticleFilter=" + harParticleFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
