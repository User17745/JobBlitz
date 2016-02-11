package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

public class Database extends ActionSupport
{
	private String database;
	
	//Generating getters and setters

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
	
	
	public String execute()
	{
		System.out.print(database);
		return database;
	}

}
