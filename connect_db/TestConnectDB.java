// package connect_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnectDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/example";// your db name
            String user="root"; // your db username
            String password=""; // your db password
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Connect success!");
            }

            var sql = "select * from user";
            var statement = conn.prepareStatement(sql);
            var resultSet = statement.executeQuery();
            showResutl(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showResutl(ResultSet resultSet) throws SQLException {
        System.out.printf("%-10s%-20s%-20s%-30s\n", "ID", "Username", "Password", "Email");
        while (resultSet.next()){
            var id = resultSet.getInt("id");
            var username = resultSet.getString("username");
            var password = resultSet.getString("password");
            var email = resultSet.getString("email");

            System.out.printf("%-10d%-20s%-20s%-30s\n", id, username, password, email);
        }
    }
}
