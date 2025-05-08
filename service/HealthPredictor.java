package service;

import model.UserData;

public class HealthPredictor {

    public static double calculateBMI(UserData user) {
        double heightInMeters = user.getHeight() / 100;
        return user.getWeight() / (heightInMeters * heightInMeters);
    }

    public static String generateHealthReport(UserData user) {
        double bmi = calculateBMI(user);
        StringBuilder report = new StringBuilder();

        report.append("Hello, ").append(user.getName()).append("!\n");
        report.append(String.format("Your BMI is: %.2f\n", bmi));

        if (bmi >= 30) {
            report.append("You are classified as Obese.\n");
        } else if (bmi >= 25) {
            report.append("You are Overweight.\n");
        } else if (bmi >= 18.5) {
            report.append("You have Normal weight.\n");
        } else {
            report.append("You are Underweight.\n");
        }

        if (user.hasDiabetes() || user.hasHypertension() || user.isSmoker()) {
            report.append("Health Risk: High\n");
            if (user.hasDiabetes()) report.append("- Diabetes\n");
            if (user.hasHypertension()) report.append("- Hypertension\n");
            if (user.isSmoker()) report.append("- Smoking\n");
        } else {
            report.append("Health Risk: Low\n");
        }

        return report.toString();
    }
}


