package state;

public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.isFinish()){
            work.setStatus(new RestState());
            work.writeProgram();
        }else{
            if(work.getHour() > 20) {
                System.out.println("当前时间："+work.getHour()+ "点，加班哦，疲劳之极");
            }else{
                work.setStatus(new ForceLeaveState());
                work.writeProgram();
            }
//            if(work.getHour() < 21) {
//                System.out.println("当前时间："+work.getHour()+ "点，加班哦，疲劳之极");
//            }else{
//                work.setStatus(new SleepingState());
//                work.writeProgram();
//            }
        }
    }
}
