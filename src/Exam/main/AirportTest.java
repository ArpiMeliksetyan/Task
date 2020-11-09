package Exam.main;

import Exam.model.Plane;
import Exam.service.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args) {
        Plane plane = new Plane("High", "Armenia", 2018, 50000, true, "Rolls-Royce", 1050, 11, 500, 250, 400);
        PlaneService planeService = new PlaneService();
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        String country = scanner.nextLine();
        int year = scanner.nextInt();
        int hours = scanner.nextInt();
        boolean isMilitary = scanner.nextBoolean();
        scanner.nextLine();
        String typeOfEngine = scanner.nextLine();
        int weight = scanner.nextInt();
        int wingspan = scanner.nextInt();
        int topSpeed = scanner.nextInt();
        long seats = scanner.nextLong();
        double costOfPlane = scanner.nextDouble();
        Plane p1 = new Plane(model, country, year, hours, isMilitary,typeOfEngine, weight, wingspan, topSpeed, seats, costOfPlane);
        planeService.printInfo(plane);
        planeService.printInfo(p1);

        planeService.printInfoOfMilitaryPlane(plane);
        planeService.printInfoOfMilitaryPlane(p1);

        Plane plane1 = new Plane("Medium", "Russia", 2020, 15, false, "BMW", 2000, 17, 750, 157, 400);
        planeService.printInfo(planeService.newerPlane(plane, plane1));

        Scanner scanner1 = new Scanner(System.in);
        String model1 = scanner1.nextLine();
        String country1 = scanner1.nextLine();
        int year1 = scanner1.nextInt();
        int hours1 = scanner1.nextInt();
        boolean isMilitary1 = scanner1.nextBoolean();
        scanner1.nextLine();
        String typeOfEngine1 = scanner1.nextLine();
        int weight1 = scanner1.nextInt();
        int wingspan1 = scanner1.nextInt();
        int topSpeed1 = scanner1.nextInt();
        long seats1 = scanner1.nextLong();
        double costOfPlane1 = scanner1.nextDouble();
        Plane p2 = new Plane(model1, country1, year1, hours1, isMilitary1,typeOfEngine1, weight1, wingspan1, topSpeed1, seats1, costOfPlane1);
        planeService.printInfoOfMilitaryPlane(planeService.newerPlane(p1,p2));

        planeService.printInfo(planeService.biggerWingspan(plane, plane1));

        Plane plane2 = new Plane("Lower", "USA", 2019, 70000, true, "Berg", 1500, 35, 1000, 277, 400);
        planeService.printInfo(planeService.highestCostOfPlane(plane1, plane, plane2));

        planeService.countryOfPlane(plane, plane1, plane2);

        Plane[] planes = {plane, plane1, plane2};
        planeService.allNotMilitaryPlanesInfo(planes);


        planeService.militaryPlanesHourBiggerThan100(planes);


        planeService.printInfo(planeService.minimalWeight(planes));


        planeService.printInfo(planeService.minimalCost(planes));


        planeService.assendingYearPlane(planes);


        planeService.notMilitaryPlanesDescending(planes);


    }
}
