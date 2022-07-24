package fr.epita.quiz.tests;

import javax.xml.transform.Result;
import java.sql.*;

public class TestDBConnection {
    public static void main(String[] args) throws SQLException {
//        testSimpleConnectionAndSelect();

        //when
        /*?currentSchema=public to be appended to the connection url to specify the schema*/
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quiz-manager-db", "postgres", "postgres");

        String createTableQuery = "CREATE TABLE IF NOT EXISTS STUDENTS( id varchar(30), name varchar(255))";
        connection.prepareStatement(createTableQuery).execute();

        String insertQuery = "INSERT INTO STUDENTS(id, name) values ('thomas@epita.fr', 'thomas')";
        connection.prepareStatement(insertQuery).execute();

    }

    private static void testSimpleConnectionAndSelect() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/NorthWind", "postgres", "postgres");
        String schema = connection.getSchema();

        System.out.println(schema);

        String sqlQuery = "select * from customers";

        PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("customer_id"));
        }

        connection.close();
    }
}
