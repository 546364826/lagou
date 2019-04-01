package com.zwj.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

public class C3P0Demo {
    public static DataSource getDataSourceWithC3P0() {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
            try {
                cpds.setDriverClass("oracle.jdbc.OracleDriver");
                cpds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
                cpds.setUser("scott");
                cpds.setPassword("tiger");
                cpds.setInitialPoolSize(10);
                cpds.setMinPoolSize(20);
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            }
        return cpds;

    }
}
