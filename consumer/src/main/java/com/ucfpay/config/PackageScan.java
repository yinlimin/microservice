package com.ucfpay.config;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * Created by lenovo on 2016/7/4.
 */
public class PackageScan {



    public static List scanPackage(String path){
        path=path.replaceAll("\\.","/");
        System.out.println(path);
        URL classpath=Thread.currentThread().getClass().getResource("/");

        return null;
    }

    public static void main(String[] args) {
        scanPackage("com.ucfpay");
    }


}
