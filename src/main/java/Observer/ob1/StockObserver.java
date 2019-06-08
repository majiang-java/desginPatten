package Observer.ob1;

public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name + "：" +"关闭股票继续工作");
    }
}
