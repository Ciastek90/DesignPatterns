package com.patterns.creational.singleton.Enum.Example;

public enum MemoryConnection {
    INSTANCE;
    private static final String DEFAULT_USER = "admin";
    private static final String DEFAULT_PASSWORD = "admin";
    private final String user;
    private final String password;

    private MemoryConnection(){
        this.user = DEFAULT_USER;
        this.password = DEFAULT_PASSWORD;
    }

    public String getData() {
        return "\nData returned form memory.\n --userName: " + this.user + " password: "
                + this.password.replaceAll("(?s).", "*");
    }
}
