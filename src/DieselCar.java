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
            groenEjerAfgift = 15260;
        } else if (kmPrL < 10){
            groenEjerAfgift = 2770;
        } else if (kmPrL < 15){
            groenEjerAfgift = 1850;
        } else if (kmPrL < 20){
            groenEjerAfgift = 1390;
        } else if (kmPrL < 50){
            groenEjerAfgift = 130;
        }

        if (!harParticleFilter) groenEjerAfgift += 1000;
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
