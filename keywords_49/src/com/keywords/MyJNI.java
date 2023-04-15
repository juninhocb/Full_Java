package com.keywords;

import java.io.File;
import java.net.URL;

/**
 * Native [28]
 *
 */
public class MyJNI {
    static {
        URL resource =  MyJNI.class.getResource("/MyDll.dll");
        String path = new File(resource.getFile()).getAbsolutePath();
        System.load(path);
    }
    public native void sayHello();

}
