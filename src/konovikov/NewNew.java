package konovikov;

public class NewNew {
   /* public String sayHello(String greeting, String name){
        return greeting + ", " + name + "!";
    }

    static double fractional(double num){
        if (num == 0)
            return 0;
        int res = (int) num;
        double result = num % res;
        return result;
    }*/


/*Используя классы-обертки реализуйте следующие методы

double toDouble(String str) метод преобразует строку в число с плавающей точкой

int maxInt() метод возвращает максимальное значение int

int toInt(String str) метод преобразует строку в число типа int*/
String str1 = "12345";
public Double toDouble () {
        

}
Double valueOf(String) {
                return null;
        }

        public static void main(String[]args){
        Double dbl1 = Double.toDouble("3.141592654");
        Integer maxInt = Integer.MAX_VALUE;
        //int b = int toInt("12345");
        }

        static double toDouble(String str){
                double d1 = Double.valueOf (str);
                return d1;
        }

        static int maxInt (){
                return Integer.MAX_VALUE;
        }

        static int toInt(String str){
                int i1 = Integer.valueOf (str);
                return i1;
        }

}
