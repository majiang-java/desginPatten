package flyWeight;

public class Main {

    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();
        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.Use(new User("小菜"));

        WebSite fx1 = f.getWebSiteCategory("产品展示");
        fx1.Use(new User("32"));

        WebSite fx2 = f.getWebSiteCategory("产品展示");
        fx2.Use(new User("441"));

        WebSite fx5 = f.getWebSiteCategory("博客");
        fx5.Use(new User("123"));

        WebSite fx7 = f.getWebSiteCategory("博客");
        fx7.Use(new User("412"));

        WebSite fx8 = f.getWebSiteCategory("博客");
        fx8.Use(new User("4215"));


        System.out.println(f.getWeSiteCount());
    }

}
