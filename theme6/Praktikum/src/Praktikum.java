import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        String date;
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            date = "12.09.";

        } else date = "13.09.";
        System.out.println(date + year);
    }

    public static boolean isLeapYear(int year) {
        // здесь нужно определить, является ли переданный год високосным
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else return false;
    }
}
