package HomeWork6;

public class  Dogs extends Animals {
   static int score =0;
    public Dogs (String name){
        super(name);
        score++;
    }
    public void run (int dist){
        if (dist<500) System.out.println("Ваша собака "+getName()+" пробежала "+dist+ " метров");
        else System.out.println("Ваша собака "+getName()+" не справилась с забегом.");
    }

}
