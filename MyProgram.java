import java.util.*;

//Task_1
//        Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
//        а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
//
//        Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
//
//        Программа должна вывести одно натуральное число.
//
//        Sample Input 1:
//        10
//        3
//        2
//        Sample Output 1:
//        8
class MyProgram{
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = (h - a)/(a - b) + 1;
        System.out.println(days);
        scanner.close();
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k < m * n && (k % n == 0 || k % m == 0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int day = 1;
        while (x <= y){
            x += x * 10 / 100;
            day++;
        }
        System.out.println(day);
        scanner.close();
    }
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *=i;
        }
        System.out.println(f);
        scanner.close();
    }
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        for (int i = a; i >= b; i-=c) {
            System.out.println(i);
        }
        scanner.close();
    }
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < n; i+=2) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        String[] numbersStr = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String numberStr : numbersStr) {
            numbers.add(Integer.parseInt(numberStr));
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int number : numbers) {
            counts.put(number, counts.getOrDefault(number, 0) + 1);
        }

        for (int number : numbers) {
            if (counts.get(number) == 1) {
                System.out.print(number + " ");
            }
        }
    }


    public static void main(String[] args){
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        task7();
    }


}

