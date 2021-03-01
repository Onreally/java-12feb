package HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee num1 = new Employee("Иванов Иван Иванович", "Уборщик", "iii@ya.ru",
                10000, 893777798, 45);
        num1.printInfo();
        System.out.println();
        Employee[] person = new Employee[5];
        person[0] = new Employee("Алексеев Алексей Алексеевич", "Кладовщик", "aaa@ya.ru", 12000, 89992515, 34);
        person[1] = new Employee("Андреев Андрей Андреевич", "Менеджер", "aaа1@ya.ru", 15000, 89992515, 26);
        person[2] = new Employee("Михайлов Михаил Михаилович", "Доставщик", "mmm@ya.ru", 18000, 899512512, 34);
        person[3] = new Employee("Алексеев Максим Алексеевич", "Заместитель Инженера", "zaming@ya.ru", 25000, 89524245, 46);
        person[4] = new Employee("Дмитриев Дмитрий Дмитриевич", "Инженер", "ing@yandex.ru", 40000, 89952512, 48);
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].printInfo();
                System.out.println();
            }
        }
    }
}