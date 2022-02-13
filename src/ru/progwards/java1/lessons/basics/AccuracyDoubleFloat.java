package ru.progwards.java1.lessons.basics;

/*Проведём простое исследование типов double и float на разницу в точности.
Посчитаем объём земли в кубических километрах двумя сходными функциями.
Одна из них будет основана на типе double, а вторая на менее точном типе float.
После чего мы сможем узнать разницу между этими значениями в кубических километрах.
Радиус земли R будем считать равным 6371.2 км (для проверки работы методов используйте это значение), а число π возьмём равным 3.14
Формула объёма шара 4/3πR3. Для решения задачи следует.
*/

public class AccuracyDoubleFloat {

    //public static double volumeBallDouble(double radius), которая будет возвращать объём шара с радиусом radius и основана на типе double.
    public static double volumeBallDouble(double radius){
        double v1 = 4.0 / 3.0 * 3.14 * radius * radius * radius;
        return v1;
    }

    //public static float volumeBallFloat(float radius), которая будет возвращать объём шара с радиусом radius и основана на типе float.
    /*
    public static float volumeBallFloat(float radius){
        float v2 = (float)(4.0 / 3.0 * 3.14F * radius * radius * radius);
        return v2;
    }
    */

    //public static float volumeBallFloat(float radius), которая будет возвращать объём шара с радиусом radius и основана на типе float.
    public static float volumeBallFloat(float radius){
        float v2 = 4.0F / 3.0F * 3.14F * radius * radius * radius;
        return v2;
    }

    //public static double calculateAccuracy(double radius),
    //которая будет возвращать разницу между функциями volumeBallDouble и volumeBallFloat
    //(они должны быть вызваны из неё с параметром radius).
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius)-volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        double R = 6371.2;
        System.out.println(volumeBallDouble(R));
        System.out.println(volumeBallFloat((float)R));
        System.out.println(calculateAccuracy(R));
    }
}
