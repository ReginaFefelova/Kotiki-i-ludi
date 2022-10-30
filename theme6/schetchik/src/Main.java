import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker st = new StepTracker();

        while (userInput != 0) {
            if (userInput == 1) {
                st.saveSteps();
            }

            if (userInput == 2) {
st.showStepStatistic();
            }

            if (userInput == 3) {
System.out.println("Введите новую цель:");
st.changePurpose(scanner.nextInt());
            }
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя

        }

        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Что хотите сделать?");
        System.out.println("1 - ввести количество шагов за определённый день.");
        System.out.println("2 - узнать статистику за определённый месяц.");
        System.out.println("3 - изменить цель по количеству шагов в день.");
        System.out.println("0 - выйти из приложения.");
    }
}

