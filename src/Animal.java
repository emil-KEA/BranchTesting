public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
    }

    public abstract void makeSound();

    public boolean eat(String foodType){
        return true;
    }

}
