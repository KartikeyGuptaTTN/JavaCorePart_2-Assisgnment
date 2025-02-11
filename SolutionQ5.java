//Q5 Implement multiple inheritance with default method inside interface.

interface Swimmer {

    void breath();
    default void swim(){
        System.out.println("Swimmer");
    }
}
interface Flyer{
    void flyerDetails();
    default void swim(){
        System.out.println("Swimmer");
    }
    default void fly(){
        System.out.println("flyer is flying");
    }
}
class Duck implements Swimmer,Flyer {
    public void breath(){
        System.out.println("Breathing");
    }
    public void flyerDetails(){
        Flyer.super.swim();
        System.out.println("Duck is Flying");
    }
    public void swim(){
        Swimmer.super.swim();
        System.out.println("Swimmer is swimming");
    }
}

public class SolutionQ5 {
    public static void main(String[] args){
    Duck obj = new Duck();
    obj.swim();
    obj.breath();
    obj.flyerDetails();
    obj.fly();
}
}
