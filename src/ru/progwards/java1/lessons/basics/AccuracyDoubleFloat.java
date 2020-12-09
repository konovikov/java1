package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        double v1 = 4.0 / 3.0 * 3.14 * radius * radius * radius;
        return v1;
    }

    public static float volumeBallFloat(float radius){
        float v2 = (float)(4.0 / 3.0 * 3.14F * radius * radius * radius);
        return v2;
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius)-volumeBallFloat((float)radius);
    }

    public static void main(String[] args) {
        double R = 6371.2;
        System.out.println(volumeBallDouble(R));
        System.out.println(volumeBallFloat((float)R));
        System.out.println(calculateAccuracy(R));
    }
}
