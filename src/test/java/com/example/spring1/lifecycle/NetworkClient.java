package com.example.spring1.lifecycle;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("constructor : url = " + url);
        connect();
        call("connect message");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect : url = " + url);
    }

    public void call(String message) {
        System.out.println("call : url = " + url + "message = " + message);
    }

    public void disconnect() {
        System.out.println("close : url = " + url);
    }

}
