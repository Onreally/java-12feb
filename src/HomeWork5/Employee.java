package HomeWork5;

import com.sun.source.tree.UsesTree;

public class Employee {
    private String fullName; // ФИО
    private String position; // должность
    private String email;
    private int salary;      // зп
    private int phoneNumber;
    private int age;


    // метод, который заполняет объект при его создании.
    public Employee(String fullName, String position, String email, int salary, int phoneNumber, int age) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    // Метод, который выводит всю информацию о сотруднике
    public void printInfo() {
        System.out.println("ФИО: " + getFullName());
        System.out.println("Полных лет: " + getAge());
        System.out.println("Должность: " + getPosition());
        System.out.println("ЗП: " + getSalary() + " рублей");
        System.out.println("Телефон для связи: " + getPhoneNumber());
        System.out.println("Почта: " + getEmail());

    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }
}
