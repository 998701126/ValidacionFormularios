package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public String username;
    public String password;

    public static Boolean passwordIsValid(String User,
                                          String Password) {
        for (Users i:getUsers()) {
            if (i.username.equals(User) ){
            if (i.password.equals(Password) ){
                return true;
            }
        }
    }
        return false;
}


    public static ArrayList<Users> getUsers(){
        ArrayList<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "yuli";
        o.password = "123456";
        list.add(o);

        Users t = new Users();
        o.username = "juanita";
        o.password = "123456";
        list.add(t);
        return list;
    }
}
