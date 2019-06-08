package Observer.event;

public class NBAObserver{
    private String name;
    private Subject subject;
    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.subject = sub;
    }

    public void closeNBA() {
        System.out.println(name + "：" +"关闭NBA直播，继续工作");
    }
}
