package Chapter1.FlyBehavior;

public class FlyNoWays implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly!!!");
    }
}
