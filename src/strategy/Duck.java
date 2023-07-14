package strategy;

public abstract class Duck {

    public void quack() {
        System.out.println("꽥꽥");
    }

    public void swim() {
        System.out.println("수영을 합니다");
    }

    public abstract void display();

}
