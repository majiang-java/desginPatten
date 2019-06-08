package adapter;

public class Main {

    public static void main(String[] args) {
        Player bdr = new Translator("巴蒂尔");
        bdr.defence();
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defence();
    }


}
