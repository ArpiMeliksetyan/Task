package shop.service.staff.validation;

import java.util.Scanner;

import static shop.util.constants.Constants.*;


public class MarketingValidation {

    public static String socialPlatform() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Facebook and Instagram");
        System.out.println("2. Twitter");
        System.out.println("3. LinkedIn");

        boolean t = true;
        String socialPlatform = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    socialPlatform = FACEBOOK_INSTAGRAM;
                    t = false;
                    break;

                case 2:
                    socialPlatform = TWITTER;
                    t = false;
                    break;

                case 3:
                    socialPlatform = LINKEDIN;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return socialPlatform;

    }

    public static String tools() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Google Analytics");
        System.out.println("2. Yandex Metrica");
        System.out.println("3. Adsense");

        boolean t = true;
        String tools = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    tools = TOOL_1;
                    t = false;
                    break;

                case 2:
                    tools = TOOL_2;
                    t = false;
                    break;

                case 3:
                    tools = TOOL_3;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return tools;
    }


    public static String position() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Junior marketing specialist");
        System.out.println("2. Middle marketing specialist");
        System.out.println("3. Senior marketing specialist");

        boolean t = true;
        String position = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    position = JUNIOR_MARKETING_SPECIALIST;
                    t = false;
                    break;
                case 2:
                    position = MID_MARKETING_SPECIALIST;
                    t = false;
                    break;

                case 3:
                    position = SENIOR_MARKETING_SPECIALIST;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);
            }
        }
        return position;
    }

    public static String department() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. SEO department");
        System.out.println("2. SMM department");

        boolean t = true;
        String department = null;

        while (t) {
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    department = MARKETING_SEO;
                    t = false;
                    break;
                case 2:
                    department = MARKETING_SMM;
                    t = false;
                    break;

                default:
                    System.out.println(INVALID_NUMBER);

            }
        }
        return department;

    }
}
