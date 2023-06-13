package cars;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FactoryDMLs {
    public ResultSet selectStatements(Statement statement, String query) throws SQLException {
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }
    public int insertStatement(Statement statement, String query) throws SQLException {
        int count = statement.executeUpdate(query);
        return count;
    }
}
