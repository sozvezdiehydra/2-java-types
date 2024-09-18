package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        int reversed = 0;

        while(value != 0){
            int digit = value % 10;
            reversed = reversed * 10 + digit;
            value /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
        //int result = reverse(576);
        //System.out.println(result);
    }


}
