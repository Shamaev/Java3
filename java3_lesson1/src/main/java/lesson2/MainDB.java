package lesson2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.*;

public class MainDB {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void main(String[] args) {
        connect();

//        try {
//            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
//            while (rs.next()) {
//                System.out.println(rs.getString("id") + rs.getString("name"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        createTable();
        addDate("Dima", "Hello");
        addDate("Roma", "Hi");
        readTable();

        // Обязательно посмотрите!!!! Напрактике нормально вот так вот вставлять переменную ..." + i + "...  ????????????

//        for (int i = 2; i <= 6 ; i++) {
//            try {
//                stmt = connection.createStatement();
//                stmt.executeUpdate("INSERT INTO massage (id, name, text) VALUES ('" + i + "', 'Dima', 'Hello')");
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }


        try {
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void readTable () {
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM massage");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getString("text"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable () {
        try {
//            pstmt = connection.prepareStatement("CREATE TABLE IF NOT EXISTS ? (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, text TEXT)");
//            pstmt.setString(1, nameTable);
//            pstmt.executeUpdate();
            stmt = connection.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS massage (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, text TEXT)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void dropTable () {
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate("DROP TABLE massage");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addDate (String name, String text) {
        try {
            pstmt = connection.prepareStatement("INSERT INTO massage (name,text) VALUES (?,?)");
            pstmt.setString(1, name);
            pstmt.setString(2, text);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void addDate (String nameTable, String name, String text) {
//        try {
//            stmt = connection.createStatement();
//            stmt.executeUpdate("INSERT INTO " + nameTable + " (name,text) VALUES (" + name + "," + text + ")");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close() throws SQLException {
        connection.close();
    }


}
