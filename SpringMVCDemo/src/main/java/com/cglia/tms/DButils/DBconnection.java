package com.cglia.tms.DButils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBconnection {
	    private static BasicDataSource dataSource;

	    static {
	        dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/cglia");
	        dataSource.setUsername("root");
	        dataSource.setPassword("root");
	    }

	    public static Connection getConnection() throws SQLException {
	        Connection connection = dataSource.getConnection();
	        return connection;
	    }
	}

