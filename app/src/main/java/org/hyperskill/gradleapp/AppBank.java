package org.hyperskill.gradleapp;

//public class App {
//    public static void main(String[] args) {
//        ColoredPrinter printer = new ColoredPrinter
//                .Builder(1, false).build();
//
//        printer.print("Hello, colorful world!",
//                Ansi.Attribute.BOLD, Ansi.FColor.BLACK, Ansi.BColor.YELLOW);
//    }
//}

import java.util.Scanner;

// declare your enum here
enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class AppBank {

    /**
     * The method change the balance of the given account according to an operation.
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        // write your implementation here
        if(operation.name().equals("WITHDRAW") && sum > account.getBalance()) {
            System.out.println("Not enough money to withdraw.");
            return false;
        }
        else {
            if (operation.name().equals("DEPOSIT")) account.balance = account.getBalance() + sum;
            if (operation.name().equals("WITHDRAW")) account.balance = account.getBalance() - sum;
            return true;
        }
    }

    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}

//enum SI {
//
//    M("length"),
//    KG("mass"),
//    S("time");
//
//    public final String quantityName;
//
//    SI(String quantityName) {
//        this.quantityName = quantityName;
//    }
//
//    // implement getQuantityName() method here
//    public String getQuantityName(){
//        return quantityName;
//    }
//
//}
//
//class EnjoyVehicle{
//    public static void main(String[] args) {
//        System.out.println(SI.M.getQuantityName());
//    }
//}

//class Vehicle {
//
//    // vehicle of your dream
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//    }
//}
//public class EnjoyVehicle {
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        Vehicle.Engine engine = vehicle.new Engine();
//        engine.start();
//    }
//}



//class Vehicle {
//
//    private String name;
//
//    // create constructor
//
//
//    public Vehicle(String name) {
//        this.name = name;
//    }
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//
//    }
//
//    // create class Body
//    class Body {
//        private String color;
//
//        public Body(String color) {
//            this.color = color;
//        }
//
//        void printColor() {
//            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.color + " body.");
//            //Vehicle Dixi has red body.
//
//        }
//
//    }
//}
//
//// this code should work
//class EnjoyVehicle {
//
//    public static void main(String[] args) {
//
//        Vehicle vehicle = new Vehicle("Dixi");
//        Vehicle.Body body = vehicle.new Body("red");
//        body.printColor();
//    }
//}


//class ChristmasTree {
//
//    private String color;
//
//    public ChristmasTree(String color) {
//        this.color = color;
//    }
//
//    // create method putTreeTopper()
//    void putTreeTopper(String colorTr){
//        ChristmasTree christmasTree = new ChristmasTree(this.color);
//        TreeTopper treeTopper = christmasTree.new TreeTopper(colorTr);
//        treeTopper.sparkle();
//    }
//
//    class TreeTopper {
//
//        private String color;
//
//        public TreeTopper(String color) {
//            this.color = color;
//        }
//
//        // create method sparkle()
//        void sparkle(){
//            //Sparkling silver tree topper looks stunning with green Christmas tree!
//            System.out.println("Sparkling "+this.color+" tree topper looks stunning with "
//                    +ChristmasTree.this.color+" Christmas tree!");
//
//        }
//    }
//}
//
//
//
//// this code should work
//class CreateHoliday {
//
//    public static void main(String[] args) {
//
//        ChristmasTree christmasTree = new ChristmasTree("green");
//        christmasTree.putTreeTopper("silver");
//    }
//}

//class Pumpkin {
//
//    private boolean forHalloween;
//
//    public Pumpkin(boolean forHalloween) {
//        this.forHalloween = forHalloween;
//    }
//
//    // create method addCandle()
//    void addCandle(){
//        if (forHalloween == true){
//            Candle candle = new Candle();
//            candle.burning();
//        }
//        else System.out.println("We don't need a candle.");
//    }
//
//    class Candle {
//
//        void burning() {
//            System.out.println("The candle is burning! Boooooo!");
//        }
//    }
//}
//
//class Vehicle {
//
//    private String name;
//
//    // create constructor
//
//    public Vehicle(String name) {
//        this.name = name;
//    }
//
//    class Engine {
//
//        // add field horsePower
//        private int horsePower;
//        // create constructor
//
//
//        public Engine(int horsePower) {
//            this.horsePower = horsePower;
//        }
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//
//        // create method printHorsePower()
//        //Vehicle Dixi has 20 horsepower
//        void printHorsePower() {
//            System.out.println("Vehicle " + Vehicle.this.name + " has " + this.horsePower + " horsepower");
//        }
//    }
//}
//
//// this code should work
//class EnjoyVehicle {
//
//    public static void main(String[] args) {
//
//        Vehicle vehicle = new Vehicle("Dixi");
//        Vehicle.Engine engine = vehicle.new Engine(20);
//        engine.printHorsePower();
//    }
//}
//
//enum Currency {
//    USD,
//    EUR,
//    GBP,
//    RUB,
//    UAH,
//    KZT,
//    CAD,
//    JPY,
//    CNY
//};
//
//enum Secret {
//    STAR, CRASH, START
//}

//public class App {
//
//    public static void main(String[] args) {
//        int counter = 0;
//
//        // write your code here
//        for (Secret secret : Secret.values()) {
//            if (secret.name().contains("STAR")) counter++;
//        }
//
//        System.out.println(counter);
//    }
//}

