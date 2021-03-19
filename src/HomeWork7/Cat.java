package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full; // показатель сытости.

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        if (appetite> p.getFood()){
            System.out.println("Коту "+name+" не хватило еды, он голоден");
        } else if(appetite<=p.getFood()) System.out.println("Кот "+name+" наелся и спит");

    }

    public int getAppetite() {
        return appetite;
    }



}