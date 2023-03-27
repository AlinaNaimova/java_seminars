//Task_1.
//        Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
//        Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
//
//        Sample Input:
//
//        8
//        11
//        Sample Output:
//
//        512
//        1331
//Task_2.
//        Вводится число n, затем n чисел целых, по одному на каждой строке.
//        Затем вводится число, на которое нужно умножить все введённые выше числа.
//        Выведите на экран результат умножения построчно.
//
//        Sample Input:
//        4
//        1
//        2
//        3
//        5
//        2
//        Sample Output:
//        2
//        4
//        6
//        10
//Task_3.
//        Реализовать простой калькулятор (+,-,=,*), только с целыми числами.


import java.util.Scanner;

class HomeTask {
    public static void cubes(Scanner scanner) {
        int[] cubes = new int[1000];
        for(int i = 1; i <= 1000; i++) {
            cubes[i - 1] = i * i * i;
        }
        System.out.println("Введите два числа через ENTER: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cubeA = cubes[a - 1];
        int cubeB = cubes[b - 1];
        System.out.println("Куб числа  " +a+ " - " +cubeA+ ", а числа " +b+ " - " +cubeB+ " .");
    }
    public static void multiplication(Scanner scanner){
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        System.out.println("Введите числа через ENTER, но количество не больше " +n+ ": ");
        int[] arrNumbs = new int[n];
        for (int i = 0; i < n; i++) {
            arrNumbs[i] = scanner.nextInt();
        }
        System.out.println("Введите число, на которое нужно умножить все введённые выше числа: ");
        int multiplier = scanner.nextInt();
        System.out.println("Результат: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arrNumbs[i] * multiplier);
        }
    }
    public static void calculator(Scanner scanner) {
        int answer = 0;
        System.out.println("Введите число: ");
        int numFirst = scanner.nextInt();
        System.out.println("Введите число: ");
        int numSecond = scanner.nextInt();
        System.out.println("Введите оперцию(+,-,*,/):");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+': answer = numFirst + numSecond;
            break;
            case '-': answer = numFirst - numSecond;
                break;
            case '*': answer = numFirst * numSecond;
                break;
            case '/': answer = numFirst / numSecond;
                break;
            default: System.out.println("Неверная операция!");
        }
        System.out.printf("Результат: " + numFirst + " " + operation + " " + numSecond + " = " + answer);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        cubes(scanner);
        System.out.println("Task 2");
        multiplication(scanner);
        System.out.println("Task 3");
        calculator(scanner);
        scanner.close();
    }
}
