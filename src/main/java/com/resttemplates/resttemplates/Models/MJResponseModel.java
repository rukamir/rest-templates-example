package com.resttemplates.resttemplates.Models;


public class MJResponseModel {
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public MJResponseModel(String uri) {
        this.uri = uri;
    }

    public MJResponseModel() {
    }

    String uri;
}
