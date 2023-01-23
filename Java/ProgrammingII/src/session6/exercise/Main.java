package session6.exercise;

import session6.car.Car;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    static final String DATA_FILE = "carData.txt";
    static ArrayList<Car> carsList = new ArrayList<>();

    //readData from the file
    public static void main(String[] args) throws IOException {
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
        char choice;

        do {
            System.out.println("Menu:");
            System.out.println("  0. Save and exit");
            System.out.println("  1. Add a session6.session6.car");
            System.out.println("  2. List all cars");
            System.out.println("  3. Modify a session6.session6.car");
            System.out.println("  4. Delete a session6.session6.car");
            System.out.println("  5. Statistics\n");

            System.out.println("Choose one:");
            choice = (char) System.in.read();
        } while( choice < '0' || choice > '5');

        System.out.println("\n");

        switch(choice) {
            case '0':
                System.out.println("Safely exited\n");
                saveDataToFile();
                break;
            case '1':
                System.out.println("Please enter the session6.session6.car information: \n");
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
                computeAndDisplayStatistics();
                break;
        }
    }



    private static void saveDataToFile() {
        File file = new File("CarData.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
    }

    private static void computeAndDisplayStatistics() {
    }

    private static void deleteCar() {
    }

    private static void modifyCar() {
    }

    private static void listCar() {
    }


//    public static void readDataFromFile() {
//
//    }

    static void addCar(){
        //provide information of the session6.session6.car
    }
}
