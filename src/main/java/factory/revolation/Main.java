package factory.revolation;

import factory.sampleFactory.Department;
import factory.sampleFactory.IDepartment;
import factory.sampleFactory.IUser;
import factory.sampleFactory.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);

        IDepartment id = DataAccess.createDepartment();

    }

}
