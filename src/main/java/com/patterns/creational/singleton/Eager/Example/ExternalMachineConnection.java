package com.patterns.creational.singleton.Eager.Example;

public final class ExternalMachineConnection {
    private final String user;
    private final String url;
    private final String password;
    private static final String DEFAULT_USER = "admin";
    private static final String DEFAULT_PASSWORD = "admin";
    private static final String DEFAULT_URL = "foo.pl";
    private static final ExternalMachineConnection INSTANCE = new ExternalMachineConnection(DEFAULT_USER,
            DEFAULT_PASSWORD, DEFAULT_URL);

    private ExternalMachineConnection(String user, String password, String url) {
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String getData() {
        return "\nData returned form machine.\n --userName: " + this.user + " url: " + this.url + " password: "
                + this.password.replaceAll("(?s).", "*");
    }

    public static ExternalMachineConnection getINSTANCE() {
        return INSTANCE;
    }
}
