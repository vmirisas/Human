public class Human {

    private String name;
    private boolean happy = false;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithBall() {
        happy= true;
    }

    public String getHappyMethod(){
        if(!happy){
            throw  new IllegalStateException();
        }
        return "i'm happy";
    }
}
