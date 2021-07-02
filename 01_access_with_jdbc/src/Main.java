import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soft_uni", "root", "root");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

		if (resultSet.next()) {
			String jobTitle = resultSet.getString(5);
			System.out.println(jobTitle);
		}

	}
}
