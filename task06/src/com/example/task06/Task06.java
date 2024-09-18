package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int result = x + y;
        int counter = 0;

        while(result != 0){
            counter++;
            result /= 10;
        }
        if(counter == 0){
            return 1;
        }

        return counter;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
