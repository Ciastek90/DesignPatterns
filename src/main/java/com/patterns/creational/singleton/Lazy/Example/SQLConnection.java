package com.patterns.creational.singleton.Lazy.Example;

public final class SQLConnection {
    private static SQLConnection INSTANCE = null;
    private static final String DEFAULT_USER = "admin";
    private static final String DEFAULT_PASSWORD = "admin";
    private static final String DEFAULT_URL = "foo.pl";
    private final String user;
    private final String password;
    private final String url;

    private SQLConnection(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String getData(){
        return "\nData returned form SQL Database.\n --userName: " + this.user + " url: " + this.url + " password: "
                + this.password.replaceAll("(?s).", "*");
    }

    public static SQLConnection getINSTANCE() {
        if (null == INSTANCE) {
            INSTANCE = new SQLConnection(DEFAULT_USER, DEFAULT_PASSWORD, DEFAULT_URL);
        }

        return INSTANCE;
    }
}
