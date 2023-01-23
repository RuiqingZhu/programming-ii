package session6.car;
//Sorry couldn't complete all.

import session6.car.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final String DATA_FILE = "src/session6/car/CarData.txt";
    static ArrayList<Car> carsList = new ArrayList<>();
    static {
        Car car1 = new Car();
        car1.setMakeModel("Mercedes S320");
        car1.setYearOfProd(2018);
        car1.setEngSizeL(3.2);

        carsList.add(car1);

        Car car2 = new Car();
        car1.setMakeModel("Kia Forte");
        car1.setYearOfProd(2016);
        car1.setEngSizeL(2.0);

        carsList.add(car2);

        Car car3 = new Car();
        car1.setMakeModel("BMW 328i");
        car1.setYearOfProd(2014);
        car1.setEngSizeL(2.8);

        carsList.add(car3);
    }

    //readData from the file
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        readDataFromFile();
        //forever -> while
        //there are some choices
        // System.out.print("\nEnter the appropriate number of choice: \n0. Exit \n1. Add a Car \n2. List all Cars (numbered) \n3. Modify a Car \n4. Delete a Car \n5. Compute and display statistics \n");

        // 0 -> saveDataToFile() exit
        // 1 -> addCar()
        // 2 -> listAllCars()
        // 3 -> modifyCar()
        // 4 -> deleteCar()
        // 5 -> computeAndDisplayStatistics()
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("  0. Save and exit");
            System.out.println("  1. Add a car");
            System.out.println("  2. List all cars");
            System.out.println("  3. Modify a car");
            System.out.println("  4. Delete a car");
            System.out.println("  5. Statistics\n");

            System.out.println("Choose one:");
            choice = System.in.read();
//        } while( choice < '0' || choice > '5');
    } while( choice >= 0 && choice <= 5);


//        System.out.println("\n");

        switch(choice) {
            case '0':
                System.out.println("Safely exited\n");
                saveDataToFile();
                break;
            case '1':
                addCar();
                break;
            case '2':
                System.out.println("Here is a list of cars:\n");
                listCar();
                break;
            case '3':
                System.out.println("Please enter the new information of the session6.session6.car:\n");
                modifyCar();
                break;
            case '4':
                System.out.println("Successfully deleted\n");
                deleteCar();
                break;
            case '5':
                System.out.println("Here is the statistics of cars:\n");
                readDataFromFile();
                break;
        }
    }



    public static void saveDataToFile() throws FileNotFoundException {
        Car car = new Car("Mercedes GLK450", 2020, 4.2);
        File file = new File("src/session6/car/CarData.txt");
        try (PrintWriter output = new PrintWriter(file);) {
            output.print("Mercedes GLK450 ");
            output.print(" " + 2020);
            output.print(" " + 4.2);
        }
    }

    public static void deleteCar() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt()-1;
        carsList.remove(input);
        System.out.println("Successfully deleted");
    }

    public static void modifyCar() {
    }

    public static void listCar() {
    }


    public static void readDataFromFile() throws FileNotFoundException {
        File file = new File(DATA_FILE);
        Car car = new Car();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            car.setMakeModel(scanner.next());
            car.setMakeModel(scanner.next());
            car.setYearOfProd(scanner.nextInt());
            car.setEngSizeL(scanner.nextDouble());

            System.out.println(car.getMakeModel() + " " + car.getMakeModel() + "  " + car.getYearOfProd() + " " + car.getEngSizeL() + " ");

        }
    }

    static void addCar() throws FileNotFoundException {
        //provide information of the car
        File file = new File(DATA_FILE);
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        try(PrintWriter output = new PrintWriter(file);) {
            System.out.println("Please enter the car information: make and model, year of production, and engine size in litre");

            car.setMakeModel(scanner.next());
            output.print(car.getMakeModel() + " ");

            car.setMakeModel(scanner.next());
            output.print(car.getMakeModel() + " ");

            car.setYearOfProd(scanner.nextInt());
            output.print(car.getYearOfProd() + " ");

            car.setEngSizeL(scanner.nextDouble());
            output.print(car.getEngSizeL() + " ");

            carsList.add(car);
            System.out.println("Successfully added the car");
        }




    }
}
