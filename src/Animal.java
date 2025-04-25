

public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " は何かをしゃべっています。");
    }
    
    public void makeSound() {
    	System.out.println(name + "は大きな音を立てました。");
    }
    
    public static void main(String[] args) {
    	Dog dog = new Dog("ポチ");
    	dog.makeSound();
    	Cat cat = new Cat("白い猫");
    	cat.makeSound();
    }
    
}
