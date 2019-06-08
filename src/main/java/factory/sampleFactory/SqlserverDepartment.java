package factory.sampleFactory;

public class SqlserverDepartment implements IDepartment {
    public void insert(Department department) {
        System.out.println("在SQLserver中给Department插一条记录");
    }

    public Department getDepartment(int id) {
        System.out.println("在SQLserver根据ID得到一条Department记录");
        return null;
    }
}
