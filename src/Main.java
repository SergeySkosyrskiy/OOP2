
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Test car = new Car("BMW X6M", 4);
        Test car2 = new Car("Honda Accord", 4);


        Test truck = new Truck("Kamaz", 6);
        Test truck2 = new Truck("Volvo", 8);


        Test bicycle = new Bicycle("Bicycle1", 2);
        Test bicycle2 = new Bicycle("Трёхколёсный велосипед", 3);

        Test[] tests = {car, car2, truck, truck2, bicycle, bicycle2};
        ServiceStation station = new ServiceStation();
        for (Test test : tests) {
            station.check(test);
        }

    }
}