package com.shikha.collectiondemo;

public class Student {

    private Integer rollno;
    private String name;

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return rollno%11;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
