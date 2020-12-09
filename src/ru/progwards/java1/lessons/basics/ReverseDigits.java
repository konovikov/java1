package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number){
        int i1 = number / 100; //выделяем первую цифру
        int i2 = (number - i1 * 100) / 10; //выделяем 2 цифру
        int i3 = number - i1*100 - i2*10; //выделяем 3 цифру
        int sum = i3 * 100 + i2 * 10 + i1; //игвертируем порядок
        return sum;
    }

    public static void main(String[] args) {
        int q = reverseDigits(123);
        System.out.println(q);;
    }

}
