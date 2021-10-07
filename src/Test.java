public class Test {

    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar("AA61550", "Suzuki","Swift", 2012, 5, 95, 20);
        DieselCar dieselCar = new DieselCar("CF21196", "Vovlo", "V90 CC", 2019, 5, true, 19.2);
        ElectricCar electricCar = new ElectricCar("CA46236", "Tesla", "3", 2021, 4, 75000, 540);

        Garage garage = new Garage();
        garage.addCar(gasolineCar);
        garage.addCar(dieselCar);
        garage.addCar(electricCar);

        for (int i = 0; i < 1000; i++) {
            garage.addCar(new ElectricCar("CA46236", "Tesla", "3", 2021, 4, 75000, 540));
        }

        System.out.println(garage);
        System.out.println(garage.calculateTotalGroenEjerAfgift());
    }
}
