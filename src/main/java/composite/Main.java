package composite;

import decorate.ConcreteComponent;

public class Main {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new HRDepartment("总公司财务部"));
        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new HRDepartment("华东分公司财务部"));
        root.add(comp);

        root.display(1);
    }
}
