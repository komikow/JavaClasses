import by.gsu.epam.Car;

public class Runner {
    public static void main(String[] args) {
        Car[] car = {
                new Car(1, "Vaz", "2101", 1980, "blue", 10000, "18-96EA"),
                new Car(2, "Gaz", "313", 1986, "red", 16000, "11-98EA"),
                new Car(3, "Zil", "2105", 1988, "black", 22600, "42-02EA"),
                new Car(4, "Gaz", "Volga", 1986, "yellow", 23000, "78-16EA"),
                new Car(5, "Volvo", "XC90", 2020, "grey", 36000, "22-31EA"),
                new Car(6, "Vaz", "2108", 1982, "red", 17000, "58-91EA"),
                new Car(1, "Vaz", "21099", 2008, "blue", 20000, "41-98EA"),
        };
        String valueBrand = "Vaz"; // given brand
        int yearOfOperation = 26;  // given years of use
        int nowYear = 2021;        // given years now
        int thisYear = 1986;       // given years
        int thisPrice = 19000;     // given price

        for (Car cars : car) {
            if (cars.getBrand().equals("Vaz")) {
                System.out.println(cars);
            }
        }
        System.out.println("...............................................");
        for (Car cars : car) {
            if (cars.getBrand().equals(valueBrand) && (nowYear - (cars.getYear())) > yearOfOperation) {
                System.out.println(cars);
            }
        }
        System.out.println("...............................................");
        for (Car cars : car) {
            if ((cars.getYear() == thisYear) && (cars.getPrice() > thisPrice)) {
                System.out.println(cars);
            }
        }
    }
}
