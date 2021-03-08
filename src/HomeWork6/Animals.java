package HomeWork6;

public  class  Animals {

    private String name;

    public Animals(String name) {
        this.name = name;

    }
    public void run (int dist){

    }
    public void swim (int dist){
    if(dist>10) System.out.println(getName()+" не справился и утонул.");
    }

    public String getName() {
        return name;
    }
}
