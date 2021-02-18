import com.sun.security.jgss.GSSUtil;


import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        oneChangeZero();
        progression();
        ifLess();
        squad();
        minMaxArray();
        balance(new int[]{1, 2, 3, 4, 2});


    }

    /* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
     [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void oneChangeZero() {
        // Сначала сгенерируем массив из случайных чисел (0-1)
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 2);
        }
        System.out.print("Начальны массив: ");
        System.out.println(Arrays.toString(num));
        // теперь проведем замену нулей на единицы, и наоборот
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                num[i] = 1;
            } else if (num[i] == 1) {
                num[i] = 0;

            }

        }
        System.out.print("Конечный массив: ");
        System.out.println(Arrays.toString(num));
    }

    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void progression() {
        int[] num = new int[8];
        for (int i = 1; i < num.length; i++) {
            num[i] = num[i - 1] + 3;

        }
        System.out.println(Arrays.toString(num));
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

    public static void ifLess() {

        int[] num = {5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Начальный массив: ");
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 6) {
                num[i] *= 2;
            }
        }
        System.out.print("Конечный массив: ");
        System.out.println(Arrays.toString(num));
    }

    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */

    public static void squad() {
        // сначала создали новый массив
        int[][] num = new int[10][10];
        int count = (int) (Math.random() * 100);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = count;
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*****************************");
        // System.out.println(Arrays.deepToString(num)); выводит не в виде таблицы.

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i == j) {
                    num[i][j] = 0;

                    System.out.print(num[i][j] + " ");
                } else if (i != j) {
                    num[i][j] = count;
                    System.out.print(num[i][j] + " ");
                    // System.out.println();
                }
            }
            System.out.println();

        }
    }

    // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void minMaxArray() {
        System.out.println();// отступ от предыдущего массива метода squad
        int max;
        int min;
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 15);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        max = num[1];
        min = num[2];

        for (int i = 0; i < num.length; i++) { // проверка на максимальное значение массива
            if (max > num[i] || max == num[i]) {
                continue;
            } else if (max < num[i]) {
                max = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) { // проверка на минимальное значение.
            if (min < num[i] || min == num[i]) {
                continue;
            } else if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
    }

    /* Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     если в массиве есть место, в котором сумма левой и правой части массива равны*/


    public static boolean balance(int[] arr) {
        int pos = 0;
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            leftSum = arr[i] + leftSum;
            if (leftSum * 2 == sum) {
                pos = arr[i];
            }

        }
        if (pos != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i == pos) {
                    System.out.print("||");
                }
                System.out.print(arr[i] + " ");

            }
            return true;
        } else System.out.println("Баланса нет.");
        return false;
    }
}