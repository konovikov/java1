package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {


    public static boolean isTriangle(int a, int b, int c){
        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return false;
        }
        return a < (b + c) && b < (a + c) && c < (a + b);
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return false;
        }
        return (a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a);
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return false;
        }
        return a==b || b==c || c==a;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(3,3,9));
        System.out.println(isRightTriangle(1,2,3));
        System.out.println(isIsoscelesTriangle(3,3,3));
    }
}
