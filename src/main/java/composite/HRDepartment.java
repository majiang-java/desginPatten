package composite;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< depth; i ++){
            sb.append("-");
        }
        System.out.println( sb.toString()+ name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println("员工招聘培训管理");
    }
}
