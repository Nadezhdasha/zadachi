/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        int b = scan.nextInt();
        double c = a / 100 * b;
        for (int i = c; i < 5; i++) {
            System.out.println();
        }

    }
}
