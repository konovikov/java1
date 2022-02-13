package konovikov;

/*public class Base1 {

            public static void printJava() {
            String fine = "Хорошо идут дела";
            String learn = "Изучаю Java я!";
            String space = " ";

            System.out.println(fine);
            System.out.println(learn);

            System.out.print(fine);
            System.out.print(space);
            System.out.println(learn);

            System.out.print(learn);
            System.out.print(space);
            System.out.println(fine);
        }

        public static void printJava(String java1, String java2) {

            System.out.println(java1);
            System.out.println(java2 + "!");

            System.out.print(java1);
            System.out.print(", ");
            System.out.print(java2);
            System.out.println("!");

            System.out.print(java2);
            System.out.print(", ");
            System.out.print(java1);
            System.out.println("!");
        }

        public static String plusJava(String message) {
            String result;
            return result = "Java - " + message + " язык программирования";
        }

        public static void main(String[] args) {
            printJava();
            printJava("Чтобы Java понимать", "Надо функции писать");
            printJava("Буду, буду программистом", "Код пишу я чисто, чисто");
            String str = plusJava("самый популярный");
            System.out.println("str = " + str);
            str = plusJava("объектно-ориентированный");
            System.out.println("str = " + str);

            System.out.println (plusJava("очень интересный"));
        }

    }
*/

import static java.lang.Double.parseDouble;

public class Base1 {
    public static void printJava() {
        String deeds = "Хорошо идут дела";
        String learn = "Изучаю Java я!";
        String space = " ";

        System.out.println(deeds);

        System.out.println(learn);

        System.out.print(deeds);
        System.out.print(space);
        System.out.println(learn);

        System.out.print(learn);
        System.out.print(space);
        System.out.println(deeds);
    }

    public static void printJava(String java1, String java2) {
        System.out.println(java1);

        System.out.print(java2);
        System.out.println("!");

        System.out.print(java1);
        System.out.print(", ");
        System.out.print(java2);
        System.out.println("!");

        System.out.print(java2);
        System.out.print(", ");
        System.out.print(java1);
        System.out.println("!");
    }

    public static String plusJava(String message){
        String result;
        return result = "Java - " + message + " язык программирования";
    }

    public static void main(String[] args) {
        printJava();
        printJava("Чтобы Java понимать", "Надо функции писать");
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");

        String str;
        str = plusJava("самый популярный");
        System.out.println("str = " + str);

        str = plusJava("объектно-ориентированный");
        System.out.println("str = " + str);

        System.out.println (plusJava("очень интересный"));
    }

}


/*

Используя классы-обертки реализуйте следующие методы

double toDouble(String str) метод преобразует строку в число с плавающей точкой

int maxInt() метод возвращает максимальное значение int

int toInt(String str) метод преобразует строку в число типа int
 */

/*
    //double toDouble(String str) метод преобразует строку в число с плавающей точкой
    static Double toDouble(String str) {
        double d1 = Double.valueOf (str);
        return d1;
    }

    //int maxInt() метод возвращает максимальное значение int
    static Integer maxInt() {
        int imax = Integer.MAX_VALUE;
        return imax;
    }

    //int toInt(String str) метод преобразует строку в число типа int
    static Integer toInt(String str) {
            int i1 = Integer.valueOf (str);
            return i1;
        }
*/