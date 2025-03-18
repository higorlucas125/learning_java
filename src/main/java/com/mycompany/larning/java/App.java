package com.mycompany.larning.java;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        GenericsNew<String> genericsNew = new GenericsNew("Hello World!");
        GenericsNew<Integer> genericsNewInt = new GenericsNew(35);

        genericsNew.showType();
        genericsNewInt.showType();


    }
}
