import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soft_uni", "root", "root");

		System.out.println("Enter salary you want to search for");
		
		double salary = Double.parseDouble(scanner.nextLine());
		
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT * FROM employees WHERE salary > " + salary);

		while (resultSet.next()) {
			String jobTitle = resultSet.getString(5);
			System.out.println(jobTitle);
		}

	}
}
