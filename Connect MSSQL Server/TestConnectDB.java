 // package connect_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestConnectDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Tutorial";// your db name
            String user="sa"; // your db username
            String password="123"; // your db password
//            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
//                    "databaseName=Tutorial;username=sa;password=123;";
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Connect success!");
            }

            var sql = "select * from dbo.Student";
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
        System.out.printf("%-6s%-20s%-15s%-30s%-20s%-10s%-20s\n", "ID",
                "Full Name", "Address", "Email",
                "Date of birth", "Gender", "Phone");
        while (resultSet.next()){
            var id = resultSet.getInt("ID");
            var fullName = resultSet.getString("FullName");
            var address = resultSet.getString("Adress");
            var email = resultSet.getString("Email");
            var dob = resultSet.getDate("DOB");
            var gender = resultSet.getString("Gender");
            var phoneNumnber = resultSet.getString("Phone");

            System.out.printf("%-6d%-20s%-15s%-30s%-20s%-10s%-20s\n", id, fullName,
                    address, email, dob, gender, phoneNumnber);
        }
    }
}
