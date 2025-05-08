import model.UserData;
import service.HealthPredictor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Health Prediction Management System ===");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Height (in cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter Weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Do you have diabetes? (true/false): ");
        boolean diabetes = sc.nextBoolean();

        System.out.print("Do you have hypertension? (true/false): ");
        boolean hypertension = sc.nextBoolean();

        System.out.print("Are you a smoker? (true/false): ");
        boolean smoker = sc.nextBoolean();

        UserData user = new UserData(name, age, height, weight, diabetes, hypertension, smoker);
        String report = HealthPredictor.generateHealthReport(user);

        System.out.println("\n=== Health Report ===");
        System.out.println(report);
    }
}

