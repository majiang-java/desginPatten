package adapter;

public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();
    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defence() {
        foreignCenter.防守();
    }
}
