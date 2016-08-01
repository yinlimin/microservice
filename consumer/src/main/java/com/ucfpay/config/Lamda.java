package com.ucfpay.config;

import java.util.Arrays;

/**
 * Created by lenovo on 2016/7/8.
 */
public class Lamda {


    public static void main(String[] args) {

        String separator = ",";
        Arrays.asList("1", "2", "3").forEach((String e) ->{ System.out.printf(e);});
    }


}
