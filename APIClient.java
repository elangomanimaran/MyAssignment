package week2.day3hw;

public class APIClient {
public void sendRequest(String endpoint)
{
	System.out.println(endpoint);
}
public void sendRequest(String endpoint, boolean requestStatus, String requestBody)
{
	System.out.println(endpoint+requestStatus+requestBody);
}
public static void main(String[] args) {
	APIClient overload = new APIClient();
	overload.sendRequest("test");
	overload.sendRequest("test2", true, "completed");
	
}
}
