import java.sql.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class MassiveVulnerableApp {

    // SQL Injection #1
    public void sqlInjection1(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #1
    public void commandInjection1(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #1
    public void hardcodedCreds1() {
        String user = "admin";
        String pass = "pass1word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #1
    public void weakRandom1() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #1
    public void logSensitive1() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #2
    public void sqlInjection2(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #2
    public void commandInjection2(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #2
    public void hardcodedCreds2() {
        String user = "admin";
        String pass = "pass2word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #2
    public void weakRandom2() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #2
    public void logSensitive2() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #3
    public void sqlInjection3(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #3
    public void commandInjection3(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #3
    public void hardcodedCreds3() {
        String user = "admin";
        String pass = "pass3word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #3
    public void weakRandom3() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #3
    public void logSensitive3() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #4
    public void sqlInjection4(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #4
    public void commandInjection4(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #4
    public void hardcodedCreds4() {
        String user = "admin";
        String pass = "pass4word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #4
    public void weakRandom4() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #4
    public void logSensitive4() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #5
    public void sqlInjection5(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #5
    public void commandInjection5(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #5
    public void hardcodedCreds5() {
        String user = "admin";
        String pass = "pass5word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #5
    public void weakRandom5() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #5
    public void logSensitive5() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #6
    public void sqlInjection6(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #6
    public void commandInjection6(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #6
    public void hardcodedCreds6() {
        String user = "admin";
        String pass = "pass6word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #6
    public void weakRandom6() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #6
    public void logSensitive6() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #7
    public void sqlInjection7(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #7
    public void commandInjection7(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #7
    public void hardcodedCreds7() {
        String user = "admin";
        String pass = "pass7word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #7
    public void weakRandom7() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #7
    public void logSensitive7() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #8
    public void sqlInjection8(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #8
    public void commandInjection8(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #8
    public void hardcodedCreds8() {
        String user = "admin";
        String pass = "pass8word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #8
    public void weakRandom8() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #8
    public void logSensitive8() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #9
    public void sqlInjection9(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #9
    public void commandInjection9(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #9
    public void hardcodedCreds9() {
        String user = "admin";
        String pass = "pass9word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #9
    public void weakRandom9() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #9
    public void logSensitive9() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #10
    public void sqlInjection10(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #10
    public void commandInjection10(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #10
    public void hardcodedCreds10() {
        String user = "admin";
        String pass = "pass10word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #10
    public void weakRandom10() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #10
    public void logSensitive10() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #11
    public void sqlInjection11(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #11
    public void commandInjection11(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #11
    public void hardcodedCreds11() {
        String user = "admin";
        String pass = "pass11word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #11
    public void weakRandom11() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #11
    public void logSensitive11() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #12
    public void sqlInjection12(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #12
    public void commandInjection12(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #12
    public void hardcodedCreds12() {
        String user = "admin";
        String pass = "pass12word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #12
    public void weakRandom12() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #12
    public void logSensitive12() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #13
    public void sqlInjection13(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #13
    public void commandInjection13(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #13
    public void hardcodedCreds13() {
        String user = "admin";
        String pass = "pass13word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #13
    public void weakRandom13() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #13
    public void logSensitive13() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #14
    public void sqlInjection14(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #14
    public void commandInjection14(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #14
    public void hardcodedCreds14() {
        String user = "admin";
        String pass = "pass14word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #14
    public void weakRandom14() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #14
    public void logSensitive14() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #15
    public void sqlInjection15(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #15
    public void commandInjection15(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #15
    public void hardcodedCreds15() {
        String user = "admin";
        String pass = "pass15word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #15
    public void weakRandom15() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #15
    public void logSensitive15() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #16
    public void sqlInjection16(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #16
    public void commandInjection16(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #16
    public void hardcodedCreds16() {
        String user = "admin";
        String pass = "pass16word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #16
    public void weakRandom16() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #16
    public void logSensitive16() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #17
    public void sqlInjection17(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #17
    public void commandInjection17(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #17
    public void hardcodedCreds17() {
        String user = "admin";
        String pass = "pass17word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #17
    public void weakRandom17() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #17
    public void logSensitive17() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #18
    public void sqlInjection18(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #18
    public void commandInjection18(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #18
    public void hardcodedCreds18() {
        String user = "admin";
        String pass = "pass18word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #18
    public void weakRandom18() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #18
    public void logSensitive18() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #19
    public void sqlInjection19(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #19
    public void commandInjection19(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #19
    public void hardcodedCreds19() {
        String user = "admin";
        String pass = "pass19word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #19
    public void weakRandom19() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #19
    public void logSensitive19() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    

    // SQL Injection #20
    public void sqlInjection20(String input) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + input + "'");
    }
    

    // Command Injection #20
    public void commandInjection20(String cmd) throws Exception {
        Runtime.getRuntime().exec("sh -c " + cmd);
    }
    

    // Hardcoded Credential #20
    public void hardcodedCreds20() {
        String user = "admin";
        String pass = "pass20word";
        System.out.println("user: " + user + ", pass: " + pass);
    }
    

    // Weak Random #20
    public void weakRandom20() {
        String token = Integer.toHexString((int)(Math.random() * 1000000));
        System.out.println("Token: " + token);
    }
    

    // Logging Sensitive Info #20
    public void logSensitive20() {
        String creditCard = "4111111111111111";
        System.out.println("Credit Card: " + creditCard);
    }
    
}