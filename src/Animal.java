public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public boolean eat(String foodType){
        return true;
    }
    public abstract void showMood(boolean mood);

}
