package _01_java_extend;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void pourInCup() {
        System.out.println("컵에 붓는다.");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}
