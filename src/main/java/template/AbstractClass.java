package template;

public abstract class AbstractClass {
    public abstract void primitiveOperation1(); //抽象行为，个性化行为放到子类去实现
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
