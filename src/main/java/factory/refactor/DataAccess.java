package factory.refactor;

import factory.sampleFactory.IUser;

public class DataAccess {
    public static final String packages = "factory.sampleFactory";
    public static final String db = "Sqlserver";
    public static IUser createUser(){
        String totalClass = packages + "." +db;
        try {
            return (IUser)DataAccess.class.getClassLoader().loadClass(totalClass).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
