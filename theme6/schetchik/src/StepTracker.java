import java.util.Scanner;

public class StepTracker {
    Scanner scanner = new Scanner(System.in);
    MonthData[] monthToData;
    int purpose = 10000;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void saveSteps() {
        System.out.println("Выберете месяц:");
        int month = scanner.nextInt();
        System.out.println("Выберете день:");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов:");
        int steps = scanner.nextInt();
        monthToData[month - 1].fillDays(day, steps);
    }

    public void showStepStatistic() {
        System.out.println("За какой месяц?");
        int month = scanner.nextInt();
        System.out.println("За этот месяц общее количество шагов составило: " + monthToData[month - 1].findSum());
        System.out.println("Максимальное пройденное количество шагов составило: " + monthToData[month - 1].findMax());
        System.out.println("Среднее количество шагов составило: " + monthToData[month - 1].findAverage());
        System.out.println("Пройденное количество километров: " + Converter.stepToKm(monthToData[month - 1].findSum()));
        System.out.println("Количество сожженных килокалорий: " + Converter.stepsToKkal(monthToData[month - 1].findSum()));
    }

    public void changePurpose(int purpose) {
this.purpose = purpose;
    }


    class MonthData {
        int[] days = new int[30];

        public void fillDays(int day, int steps) {
            days[day - 1] = steps;
        }

        public int findMax() {
            int max = 0;
            for (int i = 0; i < days.length; i++) {
                if (days[i] > max) max = days[i];
            }
            return max;
        }

        public int findAverage() {
          return findSum()/days.length;
        }

        public int findSum() {
            int sum = 0;
            for (int i = 0; i < days.length; i++) {
                sum += days[i];
            }
            return sum;
        }
    }
}
