package oop.package2;

public class ReadOnly {
    private String username;
    private String password;
    private String connectionString;

    public ReadOnly(String username, String password, String connectionString) {
        this.username = username;
        this.password = password;
        this.connectionString = connectionString;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConnectionString() {
        return connectionString;
    }
}
