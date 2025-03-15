package com.test.troetskiymatveyvladislavovich;

import java.io.Serializable;

public class MyObject implements Serializable {
    private String name;
    private String group;
    private int age;
    private int mark;

    public MyObject(String name, String group, int age, int mark) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.mark = mark;
    }

    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getAge() { return age; }

    public int getMark() { return mark; }
}