package command;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList();

    public void setOrder(Command command){
        if(command instanceof  BakeChickenWingCommand) {
            System.out.println("没有鸡翅了");
        }else{
            orders.add(command);
            System.out.println("增加订单" +command.toString() +"时间" + new Date());
        }
    }

    public void cancelOrder(Command command){
        orders.remove(command);
    }


    public void Notify(){
        for (Command command : orders) {
            command.executeCommond();
        }
    }
}
