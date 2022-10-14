package onGK.connect;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Connect {
	public static MongoDatabase db() {
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase("khachhang");
		return database;
	}
}
