package factory.sampleFactory;

public class SqlserverUser implements IUser{

    public void insert(User user) {
        System.out.println("在SQL中给User表新增一条记录");
    }

    public User getUser(int id) {

        System.out.println("在SQL Server中根据ID得到User表的一条记录");
        return null;
    }
}
