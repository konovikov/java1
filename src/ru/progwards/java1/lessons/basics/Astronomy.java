package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static final double PI = 3.14;

    public static Double sphereSquare(Double r){
        return 4 * PI * r* r;
    }

    public static Double earthSquare(){
        double r = 6_371.2;
        return sphereSquare(r);
    }

    public static Double mercurySquare(){
        double r = 2_439.7;
        return sphereSquare(r);
    }

    public static Double jupiterSquare(){
        double r = 71_492;
        return sphereSquare(r);
    }

    public static Double earthVsMercury(){
             return earthSquare() / mercurySquare();
    }

    public static Double earthVsJupiter(){
             return earthSquare() / jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }

}
