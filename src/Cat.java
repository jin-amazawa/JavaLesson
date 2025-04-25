

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " はニャー！と鳴きます。");
    }
    
    public void makeSound() {
    	System.out.println(name + "はめちゃめちゃ大きな音を立てました。");
    }
}
