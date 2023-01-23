package finalExam;

//Couldn't figure out how to properly parse java.util.Date so that it can be compared and used in methods. This prevented the whole program from running :(

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);
    static final String DATA_FILE = "src/finalExam/airportData.txt";

    static ArrayList<Airport> airportList = new ArrayList<>();

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    public static void main(String[] args) {

        readDataFromFile();

        while (true) {
            System.out.println("Please choose from the following options:");
            System.out.println("0 -> Exit");
            System.out.println("1 -> Show all airports (codes, city names, opening dates)");
            System.out.println("2 -> Find the distance between two airports by codes ( in Kilometers)");
            System.out.println("3 -> Add a new airport to the list");
            System.out.println("4 -> List airports from oldest to newest");

            int userInput = input.nextInt();

            input.nextLine();
            switch (userInput) {
                case 0:
                    saveDataIntoFileAndExit();
                    System.out.println("Successfully saved!");
                    return;
                case 1:
                    showAllAirports();
                    break;
                case 2:
                    findDistance();
                    break;
                case 3:
                    addNewAirport();
                    break;
                case 4:
                    sortAirportFromOldToNew();
                    break;
            }
        }
    }

    private static void readDataFromFile() {
        try (Scanner reader = new Scanner(new File(DATA_FILE))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] dataLine = line.split(";");

                if (dataLine.length != 5) {
                    System.out.println("Error in reading the file");
                    continue;
                }

                String code = dataLine[0];
                String city = dataLine[1];
                double latitude = Double.parseDouble(dataLine[2]);
                double longitude = Double.parseDouble(dataLine[2]);
                Date openingDate = sdf.parse(dataLine[3]);
                airportList.add(new Airport(code, city, latitude, longitude, openingDate));
            }
        } catch (IOException e) {
            System.out.println("there is an exception in reading/writing the data " + e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveDataIntoFileAndExit() {
        if (!airportList.isEmpty()) {
            try (PrintWriter writer = new PrintWriter(new File(DATA_FILE))) {
                for (Airport airport : airportList) {
                    writer.println(airport.toString());
                }
            } catch (IOException e) {
                System.out.println("there is an exception in reading/writing the data " + e.getMessage());
            }
        }
    }

    private static void showAllAirports() {
        if (airportList.isEmpty()) {
            System.out.println("There are no airports in the system. please add an airport");
            return;
        }
        for (Airport airport : airportList) {
            System.out.println(airport);
        }
    }

    private static void findDistance() {
        //Couldn't complete this method
    }

    private static void addNewAirport() {
        try {
            System.out.println("Enter the airport code: ");
            String code = input.nextLine();
            System.out.println("Enter the city: ");
            String city = input.nextLine();
            System.out.println("Enter the latitude: ");
            double latitude = input.nextDouble();
            System.out.println("Enter the longitude: ");
            double longitude = input.nextDouble();
            System.out.println("Enter the opening date: ");
            Date openingDate = sdf.parse(input.nextLine());

            Airport airport = new Airport(code, city, latitude, longitude, openingDate);
            airportList.add(airport);
        } catch (ParseException paramException) {
            System.out.println("Please enter valid input " + paramException.getMessage());
        }
    }

    private static void sortAirportFromOldToNew() {
        if (airportList.isEmpty()) {
            System.out.println("There are no airports in the system. please add an airport");
            return;
        }

        Airport oldestAirport = airportList.get(0);
        for (Airport airport : airportList) {
            if (oldestAirport.getOpeningDate().after(airport.getOpeningDate())) {
                oldestAirport = airport;
            }
            System.out.println(airport);
        }
    }

}