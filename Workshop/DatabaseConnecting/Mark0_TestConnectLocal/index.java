package DatabaseConnecting.Mark0_TestConnectLocal;

import java.sql.*;

public class index {

    static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/RoFind_db";
        String username = "root";
        String password = "";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery("SELECT * FROM `Buildings`;")
                ) {

                while(resultSet.next()){

                    System.out.println("Building " + resultSet.getString(2).substring(1) + ": " + resultSet.getString(1));

                }



            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}














