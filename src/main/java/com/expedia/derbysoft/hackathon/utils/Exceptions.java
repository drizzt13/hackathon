package com.expedia.derbysoft.hackathon.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class Exceptions {

    public static String getExceptionMessage(Throwable e) {
        String message = e.getMessage();
        if (message != null) {
            return message;
        }
        return getStackTrace(e);
    }

    public static String getStackTrace(Throwable ex) {
        StringWriter stringWriter = new StringWriter();
        ex.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

}
