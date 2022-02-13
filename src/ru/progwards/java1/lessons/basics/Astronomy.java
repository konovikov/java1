package ru.progwards.java1.lessons.basics;

public class Astronomy {

    //Во всех функциях, где это необходимо, считаем число π = 3.14
    public static final double PI = 3.14;

   //public static Double sphereSquare(Double r), которая вычисляет площадь поверхности сферы радиуса R по формуле S = 4πR2.
    public static Double sphereSquare(Double r){
        double s = 4 * PI * r* r;
        return s;
    }

    //public static Double earthSquare(), которая вычисляет площадь поверхности Земли, считая радиус равным 6 371.2 км и используют функцию sphereSquare
    public static Double earthSquare(){
        double r = 6_371.2;
        return sphereSquare(r);
    }

    //public static Double mercurySquare(), которая вычисляет площадь поверхности Меркурия, считая радиус равным 2 439,7 км  и используют функцию sphereSquare
    public static Double mercurySquare(){
        double r = 2_439.7;
        return sphereSquare(r);
    }

    //public static Double jupiterSquare(), которая вычисляет площадь поверхности Юпитера, считая радиус равным 71 492 км  и используют функцию sphereSquare
    public static Double jupiterSquare(){
        double r = 71_492;
        return sphereSquare(r);
    }

    //public static Double earthVsMercury(), которая вычисляет отношение площади поверхности Земли к площади поверхности Меркурия используя готовые функции площадей планет
    public static Double earthVsMercury(){
             return earthSquare() / mercurySquare();
    }

    //public static Double earthVsJupiter(), которая вычисляет отношение площади поверхности Земли к площади поверхности Юпитера используя готовые функции площадей планет
    public static Double earthVsJupiter(){
             return earthSquare() / jupiterSquare();
    }

    /*Для тестирования решения используйте функцию main, в ней
    вызовите earthSquare(), mercurySquare(), JupiterSquare() и выведите их значения на консоль
    вызовите earthVsMercury(), earthVsJupiter()  и выведите их значения на консоль*/

    public static void main(String[] args) {
        System.out.println(earthSquare());
        System.out.println(mercurySquare());
        System.out.println(jupiterSquare());
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }

}
