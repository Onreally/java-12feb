package HomeWork7;

public class EatApp {
    public static void main(String[] args) {
        // Cat cat = new Cat("Барсик",15);
        // Cat cat1=new Cat("Борис", 20);
        // Cat cat2=new Cat("Борис1", 20);
        Plate plate = new Plate(60);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик0", 10);
        cats[1] = new Cat("Барсик1", 10);
        cats[2] = new Cat("Барсик2", 10);
        cats[3] = new Cat("Барсик3", 10);
        cats[4] = new Cat("Барсик4", 10);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
        }
        plate.setFood(30); // метод добавления еды
        plate.info();
    }
}
