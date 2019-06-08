package flyWeight;

public class ConcreteWebSite extends WebSite{
    private String name = "";

    ConcreteWebSite(String name) {
        this.name = name;
    }


    @Override
    public void Use(User user) {
        System.out.println("网站分类:" + name + "用户"  + user.getName());
    }
}
