

public class Dog extends Animal {
    public Dog(String name) {
        super(name); 
    }

    @Override
    public void speak() {
        System.out.println(name + " はワンワン！と吠えます。");
    }
    
    public void makeSound() {
    	System.out.println(name + "はめちゃめちゃ大きな音を立てました。");
    }
    
}
