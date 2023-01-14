// data hiding using access modifiers

abstract class Animal {
    public void walk(){

    }
}
class Horse extends Animal{
    @java.lang.Override
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    @java.lang.Override
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class OOPS {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}