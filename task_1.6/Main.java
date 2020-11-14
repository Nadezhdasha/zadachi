/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        double num2 = num1 / 100 * 15;
        System.out.println(num1 + num2);*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        double num2 = num1*15.0/100;
        System.out.println(num1+num2);
}
}
//вторая формула вроде работает вернее- тут нужна помощь, а так обе считают
