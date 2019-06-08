package chainofres;

public class Main {

    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("锦里");
        Majordomo majordomo = new Majordomo("王五");
        GeneralManager generalManager = new GeneralManager("杜工");

        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

//        Request request = new Request();
//        request.setRequestType("请假");
//        request.setRequestContent("小菜请假");
//        request.setNumber(1);
//        commonManager.requestApplication(request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        commonManager.requestApplication(request2);
    }
}
