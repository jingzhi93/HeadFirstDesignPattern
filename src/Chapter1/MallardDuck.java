package Chapter1;

import Chapter1.FlyBehavior.FlyWithWings;
import Chapter1.QuackBehavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
