package model;

public class UserData {
    private String name;
    private int age;
    private double height; // in cm
    private double weight; // in kg
    private boolean diabetes;
    private boolean hypertension;
    private boolean smoker;

    // Constructor
    public UserData(String name, int age, double height, double weight,
                    boolean diabetes, boolean hypertension, boolean smoker) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.diabetes = diabetes;
        this.hypertension = hypertension;
        this.smoker = smoker;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public boolean hasDiabetes() { return diabetes; }
    public boolean hasHypertension() { return hypertension; }
    public boolean isSmoker() { return smoker; }
}

