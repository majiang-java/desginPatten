package factory.sampleFactory;

public class AccessUser implements IUser {
    public void insert(User user) {
        System.out.println("在Access中给User表新增一条记录");
    }

    public User getUser(int id) {
        System.out.println("在Access中给User表新增一条记录");
        return null;
    }
}
