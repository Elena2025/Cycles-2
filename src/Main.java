public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int contribution = 15000;
        int amountSaving = 0;
        int months = 1;
        while (amountSaving < 2_459_000) {
            amountSaving = amountSaving + contribution;
            amountSaving = amountSaving + amountSaving / 100;
            months += 1;
        }
        System.out.println("Месяц " + months +" , сумма накоплений равна " + amountSaving + " рублей.");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int j = 0;
        while (j < 10){
            j += 1;
            System.out.print(j + " ");
        } System.out.println();
        for( int i = 10; i > 0; i -= 1){
            System.out.print(i + " ");
        } System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int populationCountryY = 12_000_000;
        int year = 0;
        while (year < 10){
            year += 1;
            populationCountryY += (populationCountryY / 1000) * (17 - 8);
            System.out.println("Год " + year + ", численность населения составляет " + populationCountryY + " чел.");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int contribution = 15000;
        int amountSaving = 0;
        int months = 0;
        while (amountSaving < 12_000_000) {
            amountSaving += contribution;
            amountSaving += (amountSaving / 100) * 7;
            months += 1;
            System.out.println("Месяц " + months +" , сумма накоплений равна " + amountSaving + " рублей.");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int contribution = 15000;
        int amountSaving = 0;
        int months = 0;
        while (amountSaving < 12_000_000) {
            amountSaving += contribution;
            amountSaving += (amountSaving / 100) * 7;
            months += 1;
            if (months % 6 == 0){
                System.out.println("Месяц " + months +" , сумма накоплений равна " + amountSaving + " рублей.");
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int contribution = 15000;
        int amountSaving = 0;
        int months = 0;
        while (months < 108) {
            amountSaving += contribution;
            amountSaving += (amountSaving / 100) * 7;
            months += 1;
            if (months % 6 == 0){
                System.out.println("Месяц " + months +" , сумма накоплений равна " + amountSaving + " рублей.");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 5;
        int day = 0;
        while (day < 31){
            day += 1;
            if (day == firstFriday) {
                firstFriday += 7;
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int yearFlight = 0;
        int currentYear = 2022;
        for ( ; yearFlight < 2200;yearFlight +=79){
            if (yearFlight > (currentYear - 200) && yearFlight < (currentYear + 100)){
                System.out.println(yearFlight);
            }
        }
    }
}