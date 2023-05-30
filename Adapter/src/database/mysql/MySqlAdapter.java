package database.mysql;

import database.Database;

public class MySqlAdapter implements Database {
    private MySqlConnection mySqlDb;
    
    public MySqlAdapter(MySqlConnection mySqlDb) {
        this.mySqlDb = mySqlDb;
    }
    
    public void connect() {
        mySqlDb.connectToMySql();
    }
    
    public void execute(String query) {
        mySqlDb.queryMySql(query);
    }
    
    public void disconnect() {
        mySqlDb.disconnectFromMySql();
    }
}
