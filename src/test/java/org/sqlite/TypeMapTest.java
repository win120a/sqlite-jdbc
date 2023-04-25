package org.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class TypeMapTest {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite::memory:");
    }

    @Test
    void getTypeMap() throws Exception {
        Connection conn = getConnection();

        Map<String, Class<?>> m = conn.getTypeMap();

        conn.close();
    }

    @Test
    void setTypeMap() throws Exception {
        Connection conn = getConnection();

        Map<String, Class<?>> m = conn.getTypeMap();
        conn.setTypeMap(m);

        conn.close();
    }
}
