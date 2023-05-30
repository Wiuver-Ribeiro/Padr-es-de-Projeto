package database.paradox;

import database.Database;

public class ParadoxAdapter implements Database {
    private ParadoxDatabase paradoxDb;
    
    public ParadoxAdapter(ParadoxDatabase paradoxDb) {
        this.paradoxDb = paradoxDb;
    }
    
    public void connect() {
        paradoxDb.connectToParadox();
    }
    
    public void execute(String query) {
        paradoxDb.queryParadox(query);
    }
    
    public void disconnect() {
        paradoxDb.disconnectFromParadox();
    }
}
