package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static final double R = 6371.2;
    public static final double PI = 3.14;

    //Формула объёма шара 4/3πR3

    public static double volumeBallDouble(double radius){
        double v1 = 4 / 3 * PI * radius * radius * radius;
        return v1;
    }


    public static float volumeBallFloat(float radius){
        float v2 = (float) (4 / 3 * PI * radius * radius * radius);
        return v2;
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(R));
        System.out.println(volumeBallFloat((float)R));
        System.out.println(calculateAccuracy(R));
    }
}
