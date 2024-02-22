package _01_java_extend;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("티백을 담근다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }
}
