package com.po;

public class Student {
    private String uname;
    private String passwd;

    public Student() {
    }

    public Student(String uname, String passwd) {
        this.uname = uname;
        this.passwd = passwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
