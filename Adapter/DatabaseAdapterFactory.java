
import database.Database;

import database.paradox.ParadoxAdapter;
import database.paradox.ParadoxDatabase;
import database.firebird.FirebirdAdapter;
import database.firebird.FirebirdDatabase;
import database.mysql.MySqlAdapter;
import database.mysql.MySqlConnection;

public class DatabaseAdapterFactory {
    public static Database createDatabase(String profile) {
        if (profile.equals("Gratuito")) {
            return new ParadoxAdapter(new ParadoxDatabase());
        } else if (profile.equals("Básico")) {
            return new FirebirdAdapter(new FirebirdDatabase());
        } else if (profile.equals("Ultimate")) {
            return new MySqlAdapter(new MySqlConnection());
        } else {
            throw new IllegalArgumentException("Perfil inválido");
        }
    }
}
