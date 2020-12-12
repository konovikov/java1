package konovikov;

public class NewNew {
   /*public String sayHello(String greeting, String name){
        return greeting + ", " + name + "!";
    }

    static double fractional(double num){
        if (num == 0)
            return 0;
        int res = (int) num;
        double result = num % res;
        return result;
    }
*/

    /*Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)

    Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1*/

    static long factorial(long n){
        if (n == 0)
                return 1;
        long mult = 1;
        for (long i=1L; i <= n ; i++) {
            mult = mult * i;
        }
        return mult;
    }


    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


}
