package Chapter1;

import Chapter1.Duck;
import Chapter1.FlyBehavior.FlyNoWays;
import Chapter1.QuackBehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWays();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
