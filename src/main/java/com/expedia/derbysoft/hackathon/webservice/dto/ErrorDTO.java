
package com.expedia.derbysoft.hackathon.webservice.dto;

import java.io.Serializable;

public class ErrorDTO implements Serializable {

    protected String code;

    protected String message;

    public ErrorDTO() {
    }

    public ErrorDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }

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
