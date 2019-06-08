package bridge;

public abstract class HandsetBrand {
    protected HandSetSoft soft;

    public void setHandsetSoft(HandSetSoft handsetSoft){
        this.soft = soft;
    }

    public abstract void run();
}
