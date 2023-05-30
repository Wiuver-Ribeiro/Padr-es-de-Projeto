package database.firebird;

import database.Database;

public class FirebirdAdapter implements Database {
    private FirebirdDatabase firebirdDb;
    
    public FirebirdAdapter(FirebirdDatabase firebirdDb) {
        this.firebirdDb = firebirdDb;
    }
    
    public void connect() {
        firebirdDb.connectToFirebird();
    }
    
    public void execute(String query) {
        firebirdDb.queryFirebird(query);
    }
    
    public void disconnect() {
        firebirdDb.disconnectFromFirebird();
    }
}
