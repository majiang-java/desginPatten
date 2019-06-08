package Observer.ob1;

public class NBAObserver extends Observer {
    public NBAObserver(String name, Sercretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name + "：" + sercretary+"关闭NBA直播，继续工作");
    }
}
