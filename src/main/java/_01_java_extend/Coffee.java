package _01_java_extend;

public class Coffee extends CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("필터를 이용해 커피를 내립니다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕과 우유를 추가합니다.");
    }
}
