package adapter;

public class Forwords extends Player {
    public Forwords(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋"+name+"进攻");
    }

    @Override
    public void defence() {
        System.out.println("前锋"+name+"防守");
    }
}
