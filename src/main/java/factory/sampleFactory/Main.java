package factory.sampleFactory;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        IFactory factory = new SqlServerFactory();
        IUser iu = factory.createUser();



        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.createDepartment();
        id.insert(department);
        id.getDepartment(1);
    }
}
