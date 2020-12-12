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

    static int addAsStrings(int n1, int n2){
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        String str3 = str1 + str2;
        return Integer.parseInt(str3);

    }

    static String textGrade(int grade){
        if (grade == 0)
            return "не оценено";
        else if (grade >= 1 && grade <= 20)
            return "очень плохо";
        else if (grade >= 21 && grade <= 40)
            return "плохо";
        else if (grade >= 41 && grade <= 60)
            return "удовлетворительно";
        else if (grade >= 61 && grade <= 80)
            return "хорошо";
        else if (grade >= 81 && grade <= 100)
            return "отлично";
        return "не определено";
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(addAsStrings(1,2));
        System.out.println(textGrade(45));
    }


}
