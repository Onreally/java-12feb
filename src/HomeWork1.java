import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения
        byte bt = 12;
        short sh = 5000;
        int integer = 32656;
        long l = 2561256L;

        float f = 10.256f;
        double d = 3.14;

        char symbol = 'c';
        boolean bool = false;
        Scanner in = new Scanner(System.in);

        System.out.println(mathExample(20,10,15.5f,11.5f));
        System.out.println(range(20,10));
        positiveOrNegative(-10);
        System.out.println(findTrueFalse(25));
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        helloName(name);
        findYear();


    }
    /* 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float */


    public static float mathExample (float a, float b, float c, float d){
        return a*(b+(c/d));

    }

    /* 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
    лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean range (int a, int b){
        boolean result=false;
        int sum = a+b;
        if (sum>=10 && sum <=20) {
            result=true;
            return  result;


        } else return false;
    }
    /* 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в
    консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом*/

    public static void positiveOrNegative (int a){
        if (a>=0){
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    /*  6. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное*/

    public static boolean findTrueFalse(int a){
        if (a<0){
            return true;
        } else return false;
    }
    /* 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/

    public  static void helloName (String name){
        System.out.println("Hello "+name);
    }
    /* 8.Написать метод, который определяет, является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный */

    public static void findYear (){
        Scanner year = new Scanner(System.in);
        System.out.println("Введите год, который хотите проверить: ");
        int numYear = year.nextInt();
        if ((numYear %4==0)&& numYear%100!=0){
            System.out.println(numYear + " год - високосный.");
        } else if (numYear %100==0 && numYear%400==0 && numYear%4==0){
            System.out.println(numYear+" год  високосный");
        } else System.out.println(numYear+ " год не високосный.");
    }

}