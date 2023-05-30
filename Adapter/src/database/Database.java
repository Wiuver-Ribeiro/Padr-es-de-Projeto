package database;

import database.Database;

public interface Database {
    void connect();
    void execute(String query);
    void disconnect();
}
