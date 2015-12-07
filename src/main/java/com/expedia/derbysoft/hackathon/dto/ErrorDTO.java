
package com.expedia.derbysoft.hackathon.dto;

import java.io.Serializable;

public class ErrorDTO implements Serializable {

    protected String code;

    protected String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
