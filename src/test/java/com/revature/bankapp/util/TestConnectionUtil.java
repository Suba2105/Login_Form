package com.revature.bankapp.util;

import java.sql.Connection;

import junit.framework.TestCase;

public class TestConnectionUtil extends TestCase {
	public void testConnection() {
        Connection connection = ConnectionUtil.getConnection();
        assertNotNull(connection);
    }

}
