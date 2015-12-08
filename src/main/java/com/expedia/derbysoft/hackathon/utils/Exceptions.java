package com.expedia.derbysoft.hackathon.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class Exceptions {

    public static String getStackTrace(Throwable ex) {
        StringWriter stringWriter = new StringWriter();
        ex.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

}
