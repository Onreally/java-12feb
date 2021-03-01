package HomeWork6;

public class Cats  extends  Animals {
    static int score=0;
    public  Cats (String name){
        super(name);
        score++;
    }
    public void  run (int dist){
        if (dist<200){
            System.out.println("Ваш кот "+getName()+" пробежал "+dist+" метров.");

        } else System.out.println("Ваш кот не справился с забегом, он устал");

    }
    public void swim(){
        System.out.println("Кот не умеет плавать, он утонул.");
    }





}
