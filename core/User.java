
package com.navis.core; //optional, 0 or 1 per .java file,always first line
import java.util.*;     //optional, 1 or more
import java.util.stream.*;

//only one public class/interface is allowed, once a class is public the file name and class name should be the same

//difference btw default and public

class Hello{}
interface welcome{}

public class User {   //top level class public or default
    //data members or properties or instance variables//constructors
    //methods- mutators and business methods (public/ private-helper)
    String userName;
    String mailId;

    private class Test{} //nested classes


    public User(){}

    public User(String username, String mailid) { //Alt+insert to create constructor
        this.userName = username;
        this.mailId = mailid;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getMailid() {
        return mailId;
    }

    public void setMailid(String mailid) {
        this.mailId = mailid;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + userName + '\'' +
                ", mailid='" + mailId + '\'' +
                '}';
    }

    public boolean validateMail(){
        if(mailId.length() < 8)
            return false;
        else
            return true;
    }



}
