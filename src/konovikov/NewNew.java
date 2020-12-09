package konovikov;

public class NewNew {
   public String sayHello(String greeting, String name){
        return greeting + ", " + name + "!";
    }

    static double fractional(double num){
        if (num == 0)
            return 0;
        int res = (int) num;
        double result = num % res;
        return result;
    }

}
