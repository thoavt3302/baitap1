
import java.sql.*;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.Base64;

public class CriticalVulnerableApp {

    public static void main(String[] args) throws Exception {
        String userInput = args.length > 0 ? args[0] : "test";
        
        // SQL Injection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE name = '" + userInput + "'");
        
        // Command Injection
        Runtime.getRuntime().exec("sh -c " + userInput);
        
        // Insecure Random for token
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        
        // Hardcoded Credentials
        String DB_USER = "admin";
        String DB_PASS = "password123";
        String AWS_SECRET = "AKIAIOSFODNN7EXAMPLE";
        
        // Hardcoded private key
        String privateKey = "-----BEGIN PRIVATE KEY-----\nMIIBVgIBADANBgkqhkiG9w0BAQEFAASC...\n-----END PRIVATE KEY-----";
        
        // Logging sensitive data
        System.out.println("Logging credentials: " + DB_USER + " / " + DB_PASS);
        
        // Weak encryption simulation
        String base64Encoded = Base64.getEncoder().encodeToString("sensitiveData".getBytes());
        System.out.println("Encoded: " + base64Encoded);
    }
}

import java.sql.*;

public class SQLInjectionVulnerableApp {

    public void vulnerableSQLQuery1(String userInput) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }

    public void vulnerableSQLQuery2(String userInput) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }

    public void vulnerableSQLQuery3(String userInput) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }

    // ...

    // Các hàm tiếp theo cũng giống tương tự như trên
    // Copy mẫu 1 hàm và lặp lại đến vulnerableSQLQuery100

    public void vulnerableSQLQuery100(String userInput) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
        ResultSet rs = stmt.executeQuery(query);
    }
}

