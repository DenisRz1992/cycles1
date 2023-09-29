public class Main {
    public static void main(String[] args) {
        System.out.println("cycles1");

        // Задача 1

        for (int i = 1; i <=10; i++) {
            System.out.println("i = " + i);
        }

        // Задача 2

        for (int q = 10; q >=1;  q--) {
            System.out.println("q = " + q);
        }

        // Задача 3

        for (int w = 0; w <= 17; w = w + 2) {
            System.out.println("w = " + w);
        }

        // Задача 4

        for (int e = 10; e >= -10; e--) {
            System.out.println("e = " + e);
        }

        // Задача 5

        for (int year = 1904; year <=2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача 6

        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println("e = " + e);
        }

        // Задача 7

        for (int r = 1; r <= 512; r = r * 2) {
            System.out.println("r = " + r);
        }

        // Задача 8

        int total = 0;
        int savings = 29000;
        for (int i = 1;  i <= 12; i++) {
            total = total + savings;
            System.out.println("месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        // Задача 9

        int total1 = 0;
        int savings1 = 29000;
        for (int q = 1;  q <= 12; q++) {
            total1 = total1 + total1/100;
            total1 = total1 + savings1;
            System.out.println("месяц " + q + ", сумма накоплений равна " + total1 + " рублей");
        }

        // Задача 10

        int number = 0;
        for (int t = 1; t <= 10 ; t++) {
            number = number + 2;
            System.out.println("2 * " + t + " = " + number);
        }
    }
}