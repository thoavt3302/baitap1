import java.sql.*;
import java.io.*;

public class CriticalVulnerabilitiesApp {

    // === SQL Injection 1 ===
    public void deleteUser1(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 1 ===
    public void runRootCommand1(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 1 ===
    private static final String JWT_SECRET_KEY_1 = "super_secret_jwt_key_1_do_not_share";
    private static final String DB_PASSWORD_1 = "P@ssw0rd1!";
    

    // === Weak Random Token 1 ===
    public String generateWeakResetToken1() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 1 ===
    public void logSensitiveInfo1(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 2 ===
    public void deleteUser2(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 2 ===
    public void runRootCommand2(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 2 ===
    private static final String JWT_SECRET_KEY_2 = "super_secret_jwt_key_2_do_not_share";
    private static final String DB_PASSWORD_2 = "P@ssw0rd2!";
    

    // === Weak Random Token 2 ===
    public String generateWeakResetToken2() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 2 ===
    public void logSensitiveInfo2(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 3 ===
    public void deleteUser3(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 3 ===
    public void runRootCommand3(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 3 ===
    private static final String JWT_SECRET_KEY_3 = "super_secret_jwt_key_3_do_not_share";
    private static final String DB_PASSWORD_3 = "P@ssw0rd3!";
    

    // === Weak Random Token 3 ===
    public String generateWeakResetToken3() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 3 ===
    public void logSensitiveInfo3(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 4 ===
    public void deleteUser4(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 4 ===
    public void runRootCommand4(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 4 ===
    private static final String JWT_SECRET_KEY_4 = "super_secret_jwt_key_4_do_not_share";
    private static final String DB_PASSWORD_4 = "P@ssw0rd4!";
    

    // === Weak Random Token 4 ===
    public String generateWeakResetToken4() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 4 ===
    public void logSensitiveInfo4(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 5 ===
    public void deleteUser5(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 5 ===
    public void runRootCommand5(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 5 ===
    private static final String JWT_SECRET_KEY_5 = "super_secret_jwt_key_5_do_not_share";
    private static final String DB_PASSWORD_5 = "P@ssw0rd5!";
    

    // === Weak Random Token 5 ===
    public String generateWeakResetToken5() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 5 ===
    public void logSensitiveInfo5(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 6 ===
    public void deleteUser6(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 6 ===
    public void runRootCommand6(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 6 ===
    private static final String JWT_SECRET_KEY_6 = "super_secret_jwt_key_6_do_not_share";
    private static final String DB_PASSWORD_6 = "P@ssw0rd6!";
    

    // === Weak Random Token 6 ===
    public String generateWeakResetToken6() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 6 ===
    public void logSensitiveInfo6(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 7 ===
    public void deleteUser7(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 7 ===
    public void runRootCommand7(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 7 ===
    private static final String JWT_SECRET_KEY_7 = "super_secret_jwt_key_7_do_not_share";
    private static final String DB_PASSWORD_7 = "P@ssw0rd7!";
    

    // === Weak Random Token 7 ===
    public String generateWeakResetToken7() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 7 ===
    public void logSensitiveInfo7(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 8 ===
    public void deleteUser8(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 8 ===
    public void runRootCommand8(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 8 ===
    private static final String JWT_SECRET_KEY_8 = "super_secret_jwt_key_8_do_not_share";
    private static final String DB_PASSWORD_8 = "P@ssw0rd8!";
    

    // === Weak Random Token 8 ===
    public String generateWeakResetToken8() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 8 ===
    public void logSensitiveInfo8(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 9 ===
    public void deleteUser9(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 9 ===
    public void runRootCommand9(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 9 ===
    private static final String JWT_SECRET_KEY_9 = "super_secret_jwt_key_9_do_not_share";
    private static final String DB_PASSWORD_9 = "P@ssw0rd9!";
    

    // === Weak Random Token 9 ===
    public String generateWeakResetToken9() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 9 ===
    public void logSensitiveInfo9(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    

    // === SQL Injection 10 ===
    public void deleteUser10(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/criticaldb", "admin", "pass");
        Statement stmt = conn.createStatement();
        stmt.execute("DELETE FROM users WHERE username = '" + username + "'");
    }
    

    // === Command Injection 10 ===
    public void runRootCommand10(String cmd) throws IOException {
        Runtime.getRuntime().exec("sudo " + cmd);
    }
    

    // === Hardcoded Secret 10 ===
    private static final String JWT_SECRET_KEY_10 = "super_secret_jwt_key_10_do_not_share";
    private static final String DB_PASSWORD_10 = "P@ssw0rd10!";
    

    // === Weak Random Token 10 ===
    public String generateWeakResetToken10() {
        int token = (int)(Math.random() * 1000000);
        return String.valueOf(token);
    }
    

    // === Sensitive Logging 10 ===
    public void logSensitiveInfo10(String email, String password) {
        System.out.println("User login: " + email + ", Password: " + password);
    }
    
}