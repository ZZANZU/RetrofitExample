package com.tistory.dayglo.retrofitexample;

/**
 * Created by user on 2017-08-06.
 */

public class Contributor {
    String login;
    String html_url;

    int contributions;

    @Override
    public String toString() {
        return login + "(" + contributions + ")";
    }
}
