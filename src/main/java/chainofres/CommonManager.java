package chainofres;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name +":" + request.getRequestType() + "数量" +request.getNumber() +"被批准");
        }else{
            if(superior != null ){
                superior.requestApplication(request);
            }
        }
    }
}
