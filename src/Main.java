
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
        task9();
        task10();
    }
    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void task2() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

        }
    }
    public static void task3() {
        for (int i = 0; i <= 17; i+=2) {
            System.out.println(i);

        }
    }
    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }
    }
    public static void task5() {
        String age = "%d год является високосным %n";
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.printf(age,i);

        }
    }
    public static void task6() {
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }
    }
    public static void task7() {
        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }
    }
    public static void task8() {
        String msg = "Месяц %d, сумма накоплений равна %d рублей %n";
        int salary = 29000;
        int money = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + salary;
            System.out.printf(msg,i,money);
        }
    }
    public static void task9() {
        String msg = "Месяц %d, сумма накоплений равна %.2f рублей %n";
        int salary = 29000;
        double money = 0;
        for (int i = 1; i <= 12; i++) {
            money = money + money/100;
            money = money + salary;
            System.out.printf(msg,i,money);
        }

    }
    public static void task10() {
        int multiplication = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = multiplication * i;
            System.out.println(multiplication + "*" + i + "=" + result);
        }
    }
    }




