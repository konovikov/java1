package konovikov;

public class Base1 {

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
