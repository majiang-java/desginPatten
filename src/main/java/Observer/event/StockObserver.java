package Observer.event;

public class StockObserver {
    private String name;
    private Subject subject;
    public StockObserver(String name, Subject sub) {
        this.name = name;
        this.subject = sub;
    }

    public void closeStockMarket() {
        System.out.println(name + "：" +"关闭股票继续工作");
    }
}
