package composite;

public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
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
        System.out.println("财务收支管理");
    }
}
