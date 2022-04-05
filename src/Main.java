public class Main {

    public static void main(String[] args) {
	    Cat cat = new Cat("john");
        Dog dog = new Dog("john");
        cat.makeSound();
        dog.makeSound();

        cat.eat("fish");
        dog.eat("doggyfood");
        cat.showMood(true);
        dog.showMood(false);

    }

}
