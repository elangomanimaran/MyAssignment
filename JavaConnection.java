package week2.day4hw;

public class JavaConnection extends MySqlConnection {
	@Override
	public void connect() {
		System.out.println("Connected to Database");

	}

	@Override
	public void disconnect() {
		System.out.println("Disonnected from Database");

	}

	@Override
	public void executeUpdate() {
		System.out.println("Updation completed");

	}

	@Override
	public void executeQuery() {
		System.out.println("Query Executed");

	}
	public static void main(String[] args) {
		JavaConnection test = new JavaConnection();
		test.connect();
		test.executeUpdate();
		test.executeQuery();
		test.disconnect();
	}



}
