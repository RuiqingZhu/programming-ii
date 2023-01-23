//package session6.car;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TestMain {
//    static Scanner sc = new Scanner(System.in);
//    static ArrayList<Car> carList = new ArrayList<>();
//
//    static {
//        Car car1 = new Car();
//        car1.setMakeModel("Mercedes S320");
//        car1.setYearOfProd(2018);
//        car1.setEngSizeL(3.2);
//
//        carList.add(car1);
//
//        Car car2 = new Car();
//        car1.setMakeModel("Kia Forte");
//        car1.setYearOfProd(2016);
//        car1.setEngSizeL(2.0);
//
//        carList.add(car2);
//
//        Car car3 = new Car();
//        car1.setMakeModel("BMW 328i");
//        car1.setYearOfProd(2014);
//        car1.setEngSizeL(2.8);
//
//        carList.add(car3);
//    }
//
//    public static void main(String[] args) {
//        int choice = 0;
//        do {
//            System.out.println("******Menu*******");
//            System.out.println("1. Add a car");
//            System.out.println("2. List all cars");
//            System.out.println("3. Modify a car");
//            System.out.println("4. Delete a car");
//            System.out.println("5. Statistics\n");
//            System.out.println("0. Save and exit");
//            System.out.println("Please choose one ");
//            choice = sc.nextInt();
//            switch(choice) {
//                case '0':
//                    System.out.println("Safely exited\n");
//                    saveDataToFile();
//                    break;
//                case '1':
//                    addCar();
//                    break;
//                case '2':
//                    System.out.println("Here is a list of cars:\n");
//                    listCar();
//                    break;
//                case '3':
//                    System.out.println("Please enter the new information of the session6.session6.car:\n");
//                    modifyCar();
//                    break;
//                case '4':
//                    System.out.println("Successfully deleted\n");
//                    deleteCar();
//                    break;
//                case '5':
//                    System.out.println("Here is the statistics of cars:\n");
//                    readDataFromFile();
//                    break;
////            switch (choice) {
////                case 1:
////                    System.out.println("请输入信息添加汽车！");
////                    addCar();
////                    break;
////                case 2:
////                    System.out.println("请输入编号删除对应汽车！");
////                    deleteCar();
////                    break;
////                case 3:
////                    System.out.println("库存汽车展示：");
////                    showCar();
////                    break;
////                case 4:
////                    System.out.println("欢迎进入汽车出租，请选择汽车编号！");
////                    outCar();
////                    break;
////                case 5:
////                    System.out.println("请输入汽车编号归还汽车");
////                    inCar();
////                    break;
////                case 6:
////                    System.out.println("查看逾期归还汽车");
////                    overdue();
////                    break;
////            }
//         while (choice != 0);
//    }
//        public static void saveDataToFile() throws FileNotFoundException {
//            Car car = new Car("Mercedes GLK450", 2020, 4.2);
//            File file = new File("src/session6/car/CarData.txt");
//            try (PrintWriter output = new PrintWriter(file);) {
//                output.print("Mercedes GLK450 ");
//                output.print(" " + 2020);
//                output.print(" " + 4.2);
//            }
//        }
//
//        public static void deleteCar() {
//        }
//
//        public static void modifyCar() {
//        }
//
//        public static void listCar() {
//        }
//
//
//        public static void readDataFromFile() throws FileNotFoundException {
//            File file = new File(DATA_FILE);
//            Car car = new Car();
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNext()) {
//                car.setMakeModel(scanner.next());
//                car.setMakeModel(scanner.next());
//                car.setYearOfProd(scanner.nextInt());
//                car.setEngSizeL(scanner.nextDouble());
//
//                System.out.println(car.getMakeModel() + " " + car.getMakeModel() + "  " + car.getYearOfProd() + " " + car.getEngSizeL() + " ");
//
//            }
//        }
//
//        static void addCar() throws FileNotFoundException {
//            //provide information of the car
//            File file = new File(DATA_FILE);
//            Car car = new Car();
//            Scanner scanner = new Scanner(System.in);
//            try(PrintWriter output = new PrintWriter(file);) {
//                System.out.println("Please enter the car information: make and model, year of production, and engine size in litre");
//
//                car.setMakeModel(scanner.next());
//                output.print(car.getMakeModel() + " ");
//
//                car.setMakeModel(scanner.next());
//                output.print(car.getMakeModel() + " ");
//
//                car.setYearOfProd(scanner.nextInt());
//                output.print(car.getYearOfProd() + " ");
//
//                car.setEngSizeL(scanner.nextDouble());
//                output.print(car.getEngSizeL() + " ");
//            }
//}
