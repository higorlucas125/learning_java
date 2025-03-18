package com.mycompany.larning.java;

public class GenericsNew<T> {

    T obj;

    public GenericsNew(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType(){
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}
