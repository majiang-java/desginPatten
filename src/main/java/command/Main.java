package command;

public class Main {


    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeChickenWingCommand(barbecuer);
        Command bakeMuttonCommand2 = new BakeChickenWingCommand(barbecuer);
        Command bakeChikenWingCommand1 = new BakeChickenWingCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeChikenWingCommand1);

        waiter.Notify();
    }

}
