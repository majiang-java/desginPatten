package factory.revolation;

import factory.sampleFactory.*;

public class DataAccess {

    public static final String db = "Sqlserver";

    public static IUser createUser(){
        IUser iuser = null;
        switch (db) {
            case "Sqlserver" :
                iuser = new SqlserverUser();
                break;
            case "Access":
                iuser = new AccessUser();
                break;

        }
        return iuser;

    }

    public static IDepartment createDepartment(){
        IDepartment iDepartment = null;
        switch (db) {
            case "Sqlserver" :
                iDepartment = new SqlserverDepartment();
                break;
            case "Access":
                iDepartment = new AccessDepartment();
                break;
        }
        return iDepartment;

    }

}
