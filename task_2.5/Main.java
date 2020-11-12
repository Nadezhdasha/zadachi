/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Укажите число");
        int number = scan.nextInt();
     if (number == 10){
         System.out.print("Верно");
     }else {
         System.out.print("Не верно");
     }
     }
    }
