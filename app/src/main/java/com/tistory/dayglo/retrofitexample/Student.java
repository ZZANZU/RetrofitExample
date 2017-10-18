package com.tistory.dayglo.retrofitexample;

/**
 * Created by user on 2017-08-06.
 */

public class Student {
    int id;
    String name;
    String modelnumber;
    String series;

    @Override
    public String toString() {
        return "(" + id + ")" + name + "/" + modelnumber + "/" + series;
    }
}
