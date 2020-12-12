package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {

    public static boolean containsDigit(int number, int digit){
        if (number == 0 && digit == 0) // проверка нолей
            return true;
        for (int i = 1; i <= number; i = i * 10) {
            int dig1 = number % (i*10)/i; //вычленяем цифры
            /*System.out.println(dig1); - тестовый вывод*/
            if (digit == dig1) //сравниваем с digit
                return true;
            number = number-dig1;
        }
         return false;
    }

    public static int fiboNumber(int n){
        int n0 = 1;
        int n1 = 1;
        int n2;

        for(int i = 3; i <= n; i++){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            /*System.out.println(n2); - тестовый вывод*/
        }
        return n1;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){

        /*защита от нулевых данных*/
        if (a<1 || b<1 || c<1){
            System.out.println("не треугольник");
            return false;
        }
        else if (a!=b && b!=c && c!=a){
            System.out.println("не равнобедренный");
            return false;
        }

        else if ((a == b) && (((double) a / (double) c) >= 1.61703) && (((double) a / (double) c) <= 1.61903))
            return true;
        else if ((b == c) && (((double) b / (double) a) >= 1.61703) && (((double) b / (double) a) <= 1.61903))
            return true;
        else if ((a == c) && (((double) a / (double) b) >= 1.61703) && (((double) a / (double) b) <= 1.61903))
            return true;
        System.out.println("не золотой");
        return false;
    }

    public static void main(String[] args) {

        System.out.println(containsDigit(0,0));//находим, содержится ли цифра

        /*выводим первые 15 чисел ряда Фибоначи*/
        for (int i=1;i<=15;i++){
            System.out.println(fiboNumber(i));
        }


        /* берем сторону a - ряд Фибоначи до 100 включительно*/
       int i = 1;
        while(fiboNumber(i)<=100) {

            double a = fiboNumber(i);

           /* подставляем сторону b - ряд Фибоначи до 100 включительно */
            int j = i+1;
            while(fiboNumber(j)<=100) {
                double b = fiboNumber(j);

                if ((b / a) >= 1.61703 && (b / a) <= 1.61903) {
                    System.out.println("\n" + "Сторона а = " + a);
                    System.out.println("Сторона b = " + b);
                }
                j++;
            }
            i++;
        }
    }

}
