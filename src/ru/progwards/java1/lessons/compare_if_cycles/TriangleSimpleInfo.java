package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {

    public static int maxSide(int a, int b, int c){
        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return 0;
        }
        else if ( (a>b||a==b) && a>c)//сторона a больше
            return a;
        else if (b>c || b==c)//сторона b больше
            return b;
        else if (c>a || c==a)//сторона c больше
            return c;
        return 0;
    }

    public static int minSide(int a, int b, int c){
        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return 0;
        }
        else if ( (a<b||a==b) && a<c)//сторона a меньше
            return a;
        else if (b<c || b==c)//сторона b меньше
            return b;
        else if (c<a || c==a)//сторона c меньше
            return c;
        return 0;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c){
        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return false;
        }
        return a == b && b == c;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(3,1,2));
        System.out.println(minSide(1,3,2));
        System.out.println(isEquilateralTriangle(2,2,3));
    }

}
