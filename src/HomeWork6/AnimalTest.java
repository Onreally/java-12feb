package HomeWork6;

public class AnimalTest {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Кипарис");
        Dogs borya = new Dogs("Борис");
        borya.run(350);
        borya.swim(250);
        cat1.run(199);
        cat1.swim();
        Cats vasya = new Cats("Василий");
        Cats catters = new Cats("Кошак");
        System.out.println("Всего создано котов: "+Cats.score);
        System.out.println("Всего создано собак: "+Dogs.score);



    }
}

