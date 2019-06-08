package state;

public class ForceLeaveState implements State{
    @Override
    public void writeProgram(Work work) {
        System.out.println("老板让20点后赶紧下班");
    }
}
