package Exam.service;

import Exam.model.Plane;

public class PlaneService {

    public void printInfo(Plane plane) {
        System.out.println("Plane{" +
                "model='" + plane.getModel() + '\'' +
                ", country='" + plane.getCountry() + '\'' +
                ", year=" + plane.getYear() +
                ", hours=" + plane.getHours() +
                ", isMilitary=" + plane.isMilitary() +
                ", typeOfEngine='" + plane.getTypeOfEngine() + '\'' +
                ", weight=" + plane.getWeight() +
                ", wingspan=" + plane.getWingspan() +
                ", topSpeed=" + plane.getTopSpeed() +
                ", seats=" + plane.getSeats() +
                ", costOfPlane=" + plane.getCostOfPlane() +
                '}');
    }

    public void printInfoOfMilitaryPlane(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println(plane.getCostOfPlane() + " " + plane.getTopSpeed());
        } else {
            System.out.println(plane.getCountry() + " " + plane.getModel());
        }
    }

    public Plane newerPlane(Plane p1, Plane p2) {
        if ((p1.getYear() > p2.getYear()) || (p1.getYear() == p2.getYear())) {
            return p1;
        } else return p2;
    }

    public Plane biggerWingspan(Plane p1, Plane p2) {
        return p1.getWingspan() > p2.getWingspan() ? p1 : p2;
    }

    public Plane highestCostOfPlane(Plane p1, Plane p2, Plane p3) {
        if (p1.getCostOfPlane() >= p2.getCostOfPlane() && p1.getCostOfPlane() >= p3.getCostOfPlane()) {
            return p1;
        } else if (p2.getCostOfPlane() >= p1.getCostOfPlane() && p2.getCostOfPlane() >= p3.getCostOfPlane()) {
            return p2;
        } else if (p1.getCostOfPlane() == p2.getCostOfPlane() && p2.getCostOfPlane() == p3.getCostOfPlane() && p3.getCostOfPlane() == p1.getCostOfPlane()) {
            return p1;
        } else {
            return p3;
        }
    }

    public void countryOfPlane(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() >= p2.getSeats() && p1.getSeats() >= p3.getSeats()) {
            System.out.println(p1.getCountry());
        } else if (p2.getSeats() >= p1.getSeats() && p2.getSeats() >= p3.getSeats()) {
            System.out.println(p2.getCountry());
        } else if (p1.getSeats() == p2.getSeats() && p2.getSeats() == p3.getSeats() && p3.getSeats() == p1.getSeats()) {
            System.out.println(p1.getCountry());
        } else {
            System.out.println(p3.getCountry());
        }
    }

    public void allNotMilitaryPlanesInfo(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (!(planes[i].isMilitary())) {
                printInfo(planes[i]);
            }
        }
    }

    public void militaryPlanesHourBiggerThan100(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if ((planes[i].isMilitary()) && planes[i].getHours() > 100) {
                printInfo(planes[i]);
            }
        }
    }

    public Plane minimalWeight(Plane[] planes) {
        int min = planes[0].getWeight();
        int index = 0;
        int count = 0;
        for (int i = 1; i < planes.length; i++) {
            if (min > planes[i].getWeight()) {
                min = planes[i].getWeight();
                index = i;
            } else if (min == planes[i].getWeight()) {
                count++;
            }
        }
        if (count == planes.length - 1) {
            return planes[0];
        }
        return planes[index];
    }

    public Plane minimalCost(Plane[] planes) {
        double min = planes[0].getWeight();
        int index = 0;
        int count = 0;
        for (int i = 1; i < planes.length; i++) {

            if (min > planes[i].getCostOfPlane() && planes[i].isMilitary() == true) {
                min = planes[i].getCostOfPlane();
                index = i;
            } else if (min == planes[i].getCostOfPlane() && planes[i].isMilitary()== true) {
                count++;
            }

            if (count == planes.length - 1) {
                index = 0;
            }

        }
        return planes[index];
    }

    public void assendingYearPlane(Plane[] planes) {
        boolean isSwaped = false;
        Plane temp;
        for (int i = 0; i < planes.length - 1; i++) {
            for (int j = 0; j < planes.length - 1 - i; j++) {
                if (planes[j].getYear() > planes[j + 1].getYear()) {
                    temp = planes[j];
                    planes[j] = planes[j + 1];
                    planes[j + 1] = temp;
                    isSwaped = true;

                }

            }
            if (!isSwaped) {
                break;
            }
        }
        for (Plane plane : planes) {
            printInfo(plane);
        }
    }

    public void notMilitaryPlanesDescending(Plane[] planes) {
        boolean isSwaped = false;
        Plane temp;
        for (int i = 0; i < planes.length - 1; i++) {
            for (int j = 0; j < planes.length - 1 - i; j++) {
                if (planes[j].getSeats() > planes[j + 1].getSeats()) {
                    temp = planes[j];
                    planes[j] = planes[j + 1];
                    planes[j + 1] = temp;
                    isSwaped = true;

                }

            }
            if (!isSwaped) {
                break;
            }
        }

        for (Plane plane : planes) {
            if (!(plane.isMilitary())) {
                printInfo(plane);
            }

        }
    }
}





