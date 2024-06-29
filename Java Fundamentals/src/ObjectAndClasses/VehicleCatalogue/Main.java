package ObjectAndClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();
        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);


            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            if (type.equals("car")) {
                cars.add(vehicle);
            } else if (type.equals("truck")) {
                trucks.add(vehicle);
            }

            input = scanner.nextLine();
        }

        while (true) {
            String model = scanner.nextLine();

            if (model.equals("Close the Catalogue")) {
                break;
            }

            for (Vehicle car : cars) {
                if (car.getModel().equals(model)){
                    System.out.println(car);
                    break;
                }
            }

            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.println(truck);
                    break;
                }
            }

        }

        double avgCarHorsepower = calculateAverageHorsepower(cars);
        double avgTruckHorsepower = calculateAverageHorsepower(trucks);

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTruckHorsepower);
    }

    private static double calculateAverageHorsepower(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            return 0.0;
        }

        double totalHorsepower = 0;
        for (Vehicle vehicle : vehicles) {
            totalHorsepower += vehicle.getHorsepower();
        }

        return totalHorsepower / vehicles.size();
    }
}
