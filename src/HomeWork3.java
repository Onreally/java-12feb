import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //findNumber();
        //gameWords();
        diamond(7);

    }


    public static void findNumber() {
        System.out.println("Добро пожаловать в игру. Вам предстоить отгадывать числа.");
        int stop = 1;
        do {
            int answer = (int) (Math.random() * 9);
            System.out.println("Попробуй отгадать число от 0 до 9: ");
            Scanner scanner = new Scanner(System.in);
            for (int i = 3; i > 0; i--) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю!");
                    break;
                } else if (userAnswer < answer) {
                    System.out.println("Загаданное число больше");
                } else System.out.println("Загаданное число меньше");
                if (i == 1) {
                    System.out.println("Вы проиграли.Загаданное число: " + answer);
                }

            }

            System.out.println("Повторим? (для продолжения введите 1, для завершения 0)");
            stop = scanner.nextInt();
        } while (stop != 0);

    }

    public static void gameWords() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int num = (int) (Math.random() * words.length);
        System.out.println("Добро пожаловать в игру \"Отгадай слово\". Попробуй отгадать, какое слово загадано.");
        System.out.print(words[num].charAt(0));
        System.out.print(words[num].charAt(1) + "#############");
        System.out.println();
        while (true) {
            Scanner in = new Scanner(System.in);
            String userAnswer = in.next();
            if (userAnswer.equals(words[num])) {
                System.out.println("Поздравляю, вы отгадали! Игра окончена.");
                break;
            } else System.out.println("Неправильно, попробуйте еще раз: ");
        }
    }

    /**
     * Функция должна создавать квадратный массив размером n
     * и заполнять его ромбиком:
     * Для n = 5
     * ..*..
     * .***.
     * *****
     * .***.
     * ..*..
     *
     * @param n - размер квадратного массива, нечетное число
     */
    public static char[][] diamond(int n) {
        int middle = (n + 1) / 2;
        char[][] squad = new char[n][n];
        for (int i = 0; i <= middle - 1; i++) {
            if (i != middle - 1) {
                for (int j = 0; j < n; j++) {
                    if (j == middle - 1) {
                        squad[i][j] = '*';
                        squad[i][j - i] = '*';
                        squad[i][j + i] = '*';
                    } else squad[i][j] = '.';



                }

            } else {
                for (int j = 0; j < squad.length; j++) {
                    squad[i][j] = '*';


                }
            }
        }
        //заполняем нижнюю половину массива
        for (int i = n - 1; i > middle; i--) {
            if (i==middle+1){
                break;
            } else
                for (int j = n-1; j >0 ; j--) {
                    if (j==middle-1){
                        squad[i][i-j]='*';
                        squad[i][i-j]='*';
                        squad[i][j]='*';
                    } else squad[i][j] = '.';

                }


        }
        //выводим массив на экран
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(squad[i][j]);
            }
            System.out.println("");
        }

        return null;
    }

