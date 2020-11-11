/* Написать функцию, которая вычисляет минимум из трёх чисел.
Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min четыре раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a, b и с.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число");
        int num3 = scan.nextInt();
        System.out.println("Минимальное число." + getMin(num1, num2, num3));
    }

    public static int getMin(int a, int b, int c) {
        if (a<b&&a<c) return a;
        else if (a>b&&c>b) return b;
        else if (c<a && c<b) return c;
        else return a;
    }

}
